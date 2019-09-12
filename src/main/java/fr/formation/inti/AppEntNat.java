package fr.formation.inti;

import fr.formation.inti.exceptions.EntNat;
import fr.formation.inti.exceptions.ErrConst;

public class AppEntNat {

	public static void main(String[] args) {

		// gestion de l'exception ErrConst via un try-catch
		EntNat n;
		try {
			n = new EntNat(-7);
			System.out.println(n.getN());
		} catch (ErrConst e) {
			System.out.println(e.getMessage()); 
		} 
			
	}
}
