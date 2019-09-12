package fr.formation.inti.exceptions;

public class Chemin2 {

	public static void main(String[] args) {

		f(true);
		System.out.println("apres f(true)");
		f(false);
		System.out.println("apres f(false)");
	}
	
	public static void f(boolean ret) {
		try {
			A a = new A(1); // produit une exception Erreur si la valeur contenue dans a est = 1
		} catch (Erreur e) {  // comme a.n = 1, une erreur est produite et est capturee par le catch
			System.out.println("*** Dans f - exception Erreur ");  // traitement
			if (ret) return; // fin de la methode si ret=true
		}
		System.out.println("suite f"); // si ret=false, il n'y a pas de return avant, et donc il y a affichage de "suite f"
	}
}
