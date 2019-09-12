package fr.formation.inti.exceptions;

public class ErrConst extends Exception {

	private int err;
	
	// constructeur de l'exception
	public ErrConst() {
		System.out.println("ATTENTION : l'entier doit etre positif !");
	}
	
	// constructeur avec commme argument la valeur ayant généré l'erreur
	public ErrConst(int err) {
		this.err = err;
		System.out.println("ATTENTION : l'entier doit etre positif ! La valeur fournie ne convient pas : " + err);
	}

	// redefinition de la methode getMessage de la classe Exception
	@Override
	public String getMessage() {
		return "Veuillez entrer un nombre positif";
	}
}
