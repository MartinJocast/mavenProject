package fr.formation.inti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.formation.inti.exoCollec.Cercle2;

/**
 * App de l'exercice 4
 * @author IN-LL-034
 *
 */
public class AppExo4 {

	public static void main(String[] args) {

		// instanciation d'objets a partir de la classe Cercle2
		Cercle2 c1 = new Cercle2(4, 5, 12.5); 
		Cercle2 c2 = new Cercle2(7, 1, 8.2); 
		Cercle2 c3 = new Cercle2(-6, -3, 17.8); 
		Cercle2 c4 = new Cercle2(5, 2, 8.2); 
		Cercle2 c5 = new Cercle2(8, -6, 11.0); 
		
		// creation d'une collection cercles : Arraylist
		List<Cercle2> cercles = new ArrayList<Cercle2>();
		// add : ajoute c1 dans la liste
		cercles.add(c1);
		cercles.add(c2);
		cercles.add(c3);
		cercles.add(c4);
		cercles.add(c5);
		
		// methode de tri sort avec en argument la liste cercles
		Collections.sort(cercles);

		// affichage du contenu de la liste cercles, triee suivant les valeurs croissantes des rayons
		afficheList(cercles);
		
	}

	/**
	 * methode qui affiche le contenu d'une liste
	 * @param cercles
	 */
	public static void afficheList(List<Cercle2> cercles) {
		for (Cercle2 c : cercles) {
			c.affiche();
		}
	}
}
