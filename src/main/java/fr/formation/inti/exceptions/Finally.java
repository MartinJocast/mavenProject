package fr.formation.inti.exceptions;

public class Finally {
	
	public static void main (String args[]) {
		f(1); // pas d'exception de generee, passage directement par le bloc finally
		f(2); // une exception Except est generee, passage dans le bloc catch, puis par le bloc finally (malgre la presence d'un return)
	}
	
	public static void f(int n) {
		try {
			if (n != 1) throw new Except(); // exception generee en cas de n != 1
		} catch (Except e) {
			System.out.println("catch dans f - n = " + n);
			return;  // s'il y a capture par le catch, il y aura un traitement puis un return
		}
		finally { // meme en cas de return dans le try ou le catch, le contenu du finally sera appliqué
			System.out.println("dans finally - n = " + n);
		}
	}
}
