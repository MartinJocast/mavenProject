package fr.formation.inti.exceptions;

public class A {

	public A (int n) throws Erreur {
		if (n==1) throw new Erreur();
	}
}
