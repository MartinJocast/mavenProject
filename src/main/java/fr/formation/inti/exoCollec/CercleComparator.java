package fr.formation.inti.exoCollec;

import java.util.Comparator;

/**
 * Classe qui permet de comparer des objets cercle suivant les valeurs croissantes de leur rayon, puis des valeurs croissantes de leur abscisse
 * @author IN-LL-034
 *
 */
public class CercleComparator implements Comparator<Cercle> {

	@Override
	public int compare(Cercle o1, Cercle o2) {
//		int value = (int) (o1.getRayon() - o2.getRayon());
		int value = Double.compare(o1.getRayon(), o2.getRayon());
		
		if(value != 0) {
			return value;
		}
		value = o1.getX() - o2.getX();
		return value;
	}
}
