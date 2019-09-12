package fr.formation.inti.fichiers;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) throws IOException {

		// créer un fichier représentant un chemin -> créer un objet
		File apath = new File("test2.txt");
		// créer "physiquement" le fichier
		apath.createNewFile();
		
		// créer un dossier représentant un chemin -> créer un objet
		File apathFold = new File("dossier");
		// créer "physiquement" le dossier
		apathFold.mkdir();
		
		// vérifier s'il existe
		System.out.println("Path exists? " + apath.exists());
		
		if (apath.exists()) {
			
			//vérifier si apath est un répertoire
			System.out.println("Directory? " + apath.isDirectory());
			
			// vérifier si apath est un chemin caché
			System.out.println("Hidden? " + apath.isHidden());

			// Nom simple
			System.out.println("Simple name: " + apath.getName());
			
			// Chemin absolu du fichier
			System.out.println("Absolute path: " + apath.getAbsolutePath());

			// verifier la taille du fichier (en octets/bytes)
			System.out.println("Length (bytes): " + apath.length());

			// Derniere modification (en milli seconde)
			long lastModifyInMillis = apath.lastModified();
			Date lastModifyDate = new Date(lastModifyInMillis);
			System.out.println("Last modify date: " + lastModifyDate);
			
		}								
	}
}


//int a = sc.nextInt();
//sc.nextLine();
