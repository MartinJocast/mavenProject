package fr.formation.inti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.formation.inti.exoCollec.Cercle;
import fr.formation.inti.exoCollec.CercleComparator;

/**
 * App de l'exercice 3
 * @author IN-LL-034
 *
 */
public class AppExo3 {

	public static void main(String[] args) {

		// instanciation d'objets a partir de la classe Cercle
		Cercle c1 = new Cercle(4, 5, 12.5); 
		Cercle c2 = new Cercle(7, 1, 8.2); 
		Cercle c3 = new Cercle(-6, -3, 17.8); 
		Cercle c4 = new Cercle(5, 2, 8.2); 
		Cercle c5 = new Cercle(8, -6, 11.0); 
		
		// creation d'une collection cercles : Arraylist
		List<Cercle> cercles = new ArrayList<Cercle>();
		// add : ajoute c1 dans la liste
		cercles.add(c1);
		cercles.add(c2);
		cercles.add(c3);
		cercles.add(c4);
		cercles.add(c5);

		// affichage du contenu de la liste cercles
		afficheList(cercles);
		System.out.println("==========================");
		
		// methode de tri sort avec en arguments la liste cercles et un comparateur qu'on va creer
		Collections.sort(cercles, new CercleComparator());
		afficheList(cercles);

	}

	/**
	 * methode qui affiche le contenu d'une liste
	 * @param cercles
	 */
	public static void afficheList(List<Cercle> cercles) {
		for (Cercle c : cercles) {
			c.affiche();
		}
	}
}
