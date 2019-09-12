package fr.formation.inti.exceptions;

public class Exercice6 {

	public static void main(String[] args) {

		int n=0;
		try {
			for (n=1; n<5; n++) FinReth.f(n); 
			// quand n=2 on a une exception prise en charge puis a nouveau generee par la methode FinReth.f(). Du coup: arret de la boucle a n=2 suite a l'apparition d'une exception
		} catch (Except e) {
			System.out.println("catch dans main - n = " + n); // capture de l'exception par le catch et traitement
		}
		finally { // le contenu du finally est appliqué
			System.out.println("dans finally de main - n = " + n);
		}
	}
}
