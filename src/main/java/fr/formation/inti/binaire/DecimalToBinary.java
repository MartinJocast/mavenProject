package fr.formation.inti.binaire;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un entier :");
		int decimal = sc.nextInt();
		decimalToBinary(decimal);
		sc.close();
	}
	
	public static void decimalToBinary(int decimal) {
		int div = Math.abs(decimal); 
		int reste;
		String bin = "";
		
		// bin si nombre decimal = 0
		if (decimal == 0) {
			bin = "0000";
		}
		
		// bin si nombre decimal est positif: methode de la division
		while(div != 0) {
			reste = div%2;
			div = div/2;
			bin += reste;
		}		
		// inversion de la chaine de caracteres bin
		bin = reverseString(bin);
		
		// si nombre decimal est negatif: complement du chiffre
		if(decimal<0) {
			StringBuffer binNeg = new StringBuffer();
			for(int i = 0; i<bin.length(); i++) {
				if (bin.charAt(i) == '0') {
					binNeg.append(1);
				} else {
					binNeg.append(0);
				}
				// +1 au complement
			}
			bin = binNeg.toString();
		}
		
		// affichage
		System.out.println("La valeur binaire de l'entier " + decimal + " est : " + bin);
	}

	/**
	 * Methode qui inverse une chaine de caracteres (String)
	 * @param bin
	 * @return
	 */
	public static String reverseString(String bin) {
		String binReverse = "";
		for (int i = bin.length() - 1; i>=0; i--) {
			binReverse += bin.charAt(i);
		}
		return binReverse;
	}
	
	
	
}
