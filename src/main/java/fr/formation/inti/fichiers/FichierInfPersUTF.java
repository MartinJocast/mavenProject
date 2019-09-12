package fr.formation.inti.fichiers;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FichierInfPersUTF {
	public static void main(String[] args) throws IOException {
		method();
	}

	public static void method() throws IOException {

		// Déclaration des objets dos, fos et sc
		DataOutputStream dos = null;
		Scanner sc = null;
		
		try {						
			// Nouveau scanner
			sc = new Scanner(System.in);
			
			// Creation d'un nouveau dossier "out" dans lequel sera stocké le fichier
			File dir = new File("out");
			dir.mkdir();
			
			// Demande, lecture du nom du fichier a créer, et création du fichier
			System.out.println("Nom du fichier a creer :");
			String path = "out/" + sc.nextLine();

			// instanciation de l'objet dos qui va permettre d'écrire dans le fichier
			dos = new DataOutputStream(new FileOutputStream(path));			
						
			System.out.println("Nombre de personnes a rentrer :");
			int nb = sc.nextInt(); sc.nextLine();

			for (int j=1; j<=nb; j++) {
				// NOM
				System.out.println("Personne "+j+" - Nom :"); // Demande du nom
				dos.writeUTF(sc.nextLine()); // dos.writeUTF : ecrit et encode au format UTF-8 dans le fichier
				
				// Meme opération pour le prenom et l'annee de naissance
				// PRENOM
				System.out.println("Personne "+j+" - Prenom :");
				dos.writeUTF(sc.nextLine()); // dos.writeUTF : ecrit et encode au format UTF-8 dans le fichier
				
				// ANNEE DE NAISSANCE
				System.out.println("Personne "+j+" - Annee de naissance :");
				dos.writeUTF(sc.nextLine()); // dos.writeUTF : ecrit et encode au format UTF-8 dans le fichier
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			// fermeture des flux: le FileOutputStream et le Scanner
			if(dos != null)
				dos.close();
			if(sc != null)
				sc.close();
		}
	
		System.out.println("fin de programme");
	}
}
