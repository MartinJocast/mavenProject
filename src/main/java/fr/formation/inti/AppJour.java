package fr.formation.inti;

import java.util.Scanner;

import fr.formation.inti.enums.JourSemaine;
import fr.formation.inti.enums.JourSemaineEnum;

public class AppJour {

	public static void main(String[] args) {

		System.out.println(JourSemaine.MARDI);
		Scanner sc = new Scanner(System.in);
		int numJour = sc.nextInt();
		if (numJour == JourSemaine.DIMANCHE) {
			System.out.println("Dimanche");
		}
		
		affiche(JourSemaineEnum.MERCREDI);
		
		JourSemaineEnum[] joursSemaine = JourSemaineEnum.values();
		for (JourSemaineEnum j : joursSemaine)  {
			System.out.print(j+" num : "+j.getNumJours()+" "+j.isWeekend()+" | ");
		}
		
		sc.close();
		
	}

	public static void affiche(JourSemaineEnum jour) {
		if (jour == JourSemaineEnum.SAMEDI) {
			System.out.println("Samedi");
		} else {
			System.out.println(jour);
		}
	}
}
