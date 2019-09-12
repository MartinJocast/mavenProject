package fr.formation.inti.exceptions;

import java.util.Scanner;

public class TstPos {

	public static void main(String[] args) {

		System.out.println("debut main");
		boolean ok = false;
		Scanner sc = new Scanner(System.in);
		
		while (!ok) {	
			try {				
				System.out.println("donnez un entier positif : ");
				int n = sc.nextInt();
				Positif ep = new Positif (n);
				ok = true;
			} catch (ErrConst e) {
				System.out.println("*** erreur construction ***");
			}
		}
		
		sc.close();
		System.out.println("fin main");
	}
}
