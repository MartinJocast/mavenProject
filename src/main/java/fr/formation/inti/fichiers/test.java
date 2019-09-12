package fr.formation.inti.fichiers;

public class test {

	public static void main(String[] args) {

		int n1 = 5;
		int n2 = 12;
		int n3 = 145;
		
		System.out.println(numLignEsp(n1)+"test");
		System.out.println(numLignEsp(n2)+"test");
		System.out.println(numLignEsp(n3)+"test");
		
		
		
	}
	
	
	/**
	 * retourne un string de 4 caracteres comprenant le numero de la ligne n suivi d'espaces
	 * @param n
	 * @return
	 */
	public static String numLignEsp(int n) {
		String strN = "" + n;
		while (strN.length() < 4) {
			strN += " ";
		}
		return strN;
	}

}
