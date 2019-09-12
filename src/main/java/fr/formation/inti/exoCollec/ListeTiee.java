package fr.formation.inti.exoCollec;

import java.util.Collections;
import java.util.List;

/**
 * Classe permettant de manipuler une liste de chaines de caracteres
 * @author IN-LL-034
 *
 */
public class ListeTiee {

	private List<String> list;
	
	// constructeur
	public ListeTiee(List<String> list) {
		this.list = list;
	}
	
	// constructeur par defaut
	public ListeTiee() {
	}
	
	/**
	 * Methode qui ajoute un element dans la liste et qui la trie
	 * @param element
	 * @param index
	 * @return
	 */
	public List<String> ajoute(String element) {
		list.add(element);
		Collections.sort(list);
		return list;		
	}
	
	/**
	 * methode qui affiche les elements de la liste apres les avoir tries
	 */
	public void affiche() {
		Collections.sort(list);
		for (String str : list) {
			System.out.print(str + " | ");
		}
		System.out.println();
	}	
}
