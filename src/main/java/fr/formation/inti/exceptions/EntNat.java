package fr.formation.inti.exceptions;

public class EntNat {

	// attribut
	private int n;
	
	// constructeur qui genere une exception de type ErrConst lorsque n est negatif
	public EntNat(int n) throws ErrConst {
		if (n >= 0) {
			this.n = n;
		} else {
			throw new ErrConst(n);
		}
	}
	
	// getter
	public int getN() {
		return n;
	}	
}