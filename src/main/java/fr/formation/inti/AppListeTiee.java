package fr.formation.inti;

import java.util.ArrayList;
import java.util.List;
import fr.formation.inti.exoCollec.ListeTiee;

public class AppListeTiee {

	public static void main(String[] args) {

		String s1 = "Bonjour";
		String s2 = "Hello";
		String s3 = "Hola";
		String s4 = "Buongiorno";
		String s5 = "Halo";
		
		// creation d'une liste contenant des chaines de caracteres et ajout de chaines de caracteres
		List<String> liste = new ArrayList<String>();
		liste.add(s1);
		liste.add(s2);
		liste.add(s5);
		
		// instanciation d'une liste direBonjour afin de la trier et d'y ajouter des elements
		ListeTiee direBonjour = new ListeTiee(liste);
		
		// affichage de la liste triee
		direBonjour.affiche();
		
		// ajout d'elements
		direBonjour.ajoute(s3);
		direBonjour.ajoute(s4);
		
		// affichage de la liste triee
		direBonjour.affiche();
	}
}
