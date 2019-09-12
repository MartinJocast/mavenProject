package fr.formation.inti.fichiers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 * Programme qui lit le contenu d'un fichier txt en numérotant les lignes
 * 4 caracteres pour l'affichage du numero de ligne, 60 caracteres par ligne
 * @author IN-LL-034
 *
 */
public class LectureExo3 {

	public static void main(String[] args) throws IOException {

		Reader r = null;
		BufferedReader bufR = null;
		Scanner sc = null;

		int n = 1; // compteur de ligne

		try {
			// lecture du nom du fichier a lire
			sc = new Scanner(System.in);
			System.out.println("Donnez le nom du fichier texte a lister :");
			String fichier = sc.nextLine();
			
			// instanciation des objets r et bufW, qui vont permettre la lecture du fichier
			r = new FileReader(fichier);
			bufR = new BufferedReader(r);
			
			// initialisation de la variable de stockage du contenu des lignes
			String line = "";
			
			System.out.println("*** debut liste fichier ***");
			
			while ((line=bufR.readLine()) != null) {  // lnr != null

				// traitement si la taille de la ligne depasse 60 caracteres, pour revenir a la ligne
				if (line.length()>60) {
					System.out.print(numLignEsp(n++)); // affichage du numero de la ligne
					int nbrLigne = (line.length()/60)+1;
					
					// boucles qui vont permettre de se déplacer sur une ligne plus grande que 60 caracteres et d'afficher caractere par caractere
					for (int i=0; i<nbrLigne; i++) { // boucle 1: déplacement entre les lignes
						for (int j=0; j<60; j++) { // boucle 2: déplacement dans une meme ligne
							
							// arret de l'affichage lorsqu'on a fini d'afficher toute la ligne
							if ((j+(60*(i))) >= line.length()) {
								break; 
							}
							
							// affichage caractere par caractere
							System.out.print(line.charAt(j+(60*(i))));
						}
						
						// retour a la ligne et affichage d'espaces, sauf apres la derniere ligne
						System.out.println();
						if (i < (nbrLigne-1)) {
							System.out.print("    ");
						}						
					}
				} else {
				System.out.println(numLignEsp(n++) + line); // affichage du numero de la ligne et du contenu de la ligne
				}
			}
			
		} catch (Exception e) { // gestion des exceptions
			e.printStackTrace();			
		} finally {
			// fermeture des flux: le Reader, le BufferedReader et le Scanner
			if (r != null)
				r.close();
			if (bufR != null)
				bufR.close();
			if (sc != null)
				sc.close();
		}		
		System.out.println("*** fin liste fichier ***");
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
