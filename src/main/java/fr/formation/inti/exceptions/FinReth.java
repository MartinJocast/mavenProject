package fr.formation.inti.exceptions;

public class FinReth {

	public static void f(int n) throws Except {
		try {
			if (n != 1) throw new Except(); // exception generee en cas de n != 1
		} catch (Except e) {
			System.out.println("catch dans f - n = " + n);
			throw e;  // s'il y a capture par le catch, il y aura un traitement puis l'exception Except est a nouveau generee
		}
		finally { // le contenu du finally est appliqué
			System.out.println("dans finally - n = " + n);
		}
	}
}
