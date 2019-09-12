package fr.formation.inti.fichiers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FichierInfPers {
	public static void main(String[] args) throws IOException {
		method();
	}

	public static void method() throws IOException {

		// Déclaration des objets fos et sc
		OutputStream fos = null;
		Scanner sc = null;
		// Déclaration des variables x et by
		String x;
		byte[] by;
		
		try {						
			// Nouveau scanner
			sc = new Scanner(System.in);
			
			// Creation d'un nouveau dossier "out" dans lequel sera stocké le fichier
			File dir = new File("out");
			dir.mkdir();
			
			// Demande, lecture du nom du fichier a créer, et création du fichier
			System.out.println("Nom du fichier a creer :");
			String path = "out/" + sc.nextLine();
			// instanciation de l'objet fos qui va permettre d'écrire dans le fichier
			fos = new FileOutputStream(path);			
						
			System.out.println("Nombre de personnes a rentrer :");
			int nb = sc.nextInt(); sc.nextLine();

			for (int j=1; j<=nb; j++) {
				// NOM
				System.out.println("Personne "+j+" - Nom :"); // Demande du nom
				x = sc.nextLine(); // lecture du nom dans la variable x				
				by = x.getBytes(); // enregistrement de ce nom dans un tableau de bytes
				for (int i=0; i<20; i++) { 
					if (i < by.length) {
						fos.write(by[i]); // fos.write va permettre d'ecrire le contenu du tableau de bytes dans le fichier
					} else fos.write(' '); // affichage d'escpaces apres la chaines de caracteres x pour atteindre 20 caracteres
				}
				
				// Meme opération pour le prenom et l'annee de naissance
				// PRENOM
				System.out.println("Personne "+j+" - Prenom :");
				x = sc.nextLine();				
				by = x.getBytes();
				for (int i=0; i<20; i++) {
					if (i < by.length) {
						fos.write(by[i]);
					} else fos.write(' '); // affichage d'escpaces apres la chaines de caracteres x pour atteindre 20 caracteres
				}
				
				// ANNEE DE NAISSANCE
				System.out.println("Personne "+j+" - Annee de naissance :");
				x = sc.nextLine();				
				by = x.getBytes();
				for (int i=0; i<20; i++) {
					if (i < by.length) {
						fos.write(by[i]);
					} else fos.write(' '); // affichage d'escpaces apres la chaines de caracteres x pour atteindre 20 caracteres
				}
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			// fermeture des flux: le FileOutputStream et le Scanner
			if(fos != null)
				fos.close();
			if(sc != null)
				sc.close();
		}
	
		System.out.println("fin de programme");
	}
}
