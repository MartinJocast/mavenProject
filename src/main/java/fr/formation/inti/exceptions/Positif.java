package fr.formation.inti.exceptions;

public class Positif {

	public Positif (int n) throws ErrConst {
		if (n<=0) throw new ErrConst();
	}
}
