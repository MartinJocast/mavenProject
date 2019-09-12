package fr.formation.inti.exoCollec;

/**
 * Solution exercice 4 :
 * @author IN-LL-034
 *
 */
public class Cercle2 implements Comparable<Cercle2> {

	private int x, y;
	double rayon;
	
	// constructeur
	public Cercle2 (int x, int y, double rayon) {
		this.x = x;
		this.y = y;
		this.rayon = rayon;
	}
	public void affiche () {
		System.out.println("Coordonnees : "+x+", "+y+" ; rayon : "+rayon);
	}
	public double getRayon () {
		return rayon;
	}
	public int getX() {
		return x;
	}
	
	// implementation de la methode compareTo de l'interface Comparable - elle sera utilisee dans l'App par la methode sort pour effectuer le tri
	@Override
	public int compareTo(Cercle2 o) {
		int value = Double.compare(this.rayon, o.rayon);
		if(value != 0) {
			return value;
		}
		value = this.x - o.x;
		return value;
	}	
}
