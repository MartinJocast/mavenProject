package fr.formation.inti.exoCollec;

/**
 * Solution exercice 3 :
 * @author IN-LL-034
 *
 */
public class Cercle {

	private int x, y;
	double rayon;
	
	// constructeur
	public Cercle (int x, int y, double rayon) {
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
}
