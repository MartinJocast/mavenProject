package fr.formation.inti.fichiers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LectureFichierPers {

	public static void main(String[] args) throws IOException {

		// déclaration de l'objet fis
		InputStream fis = null;
		
		try {
			// instanciation de l'objet fis qui va permettre de lire le contenu du fichier "test"
			fis = new FileInputStream("out/test");
			
			// tableau temporaire qui va enregistrer les suites de 20 caracteres
			byte [] by = new byte [20];
			int i = -1;
			
			// lecture et affichage des suites de 20 caracteres
			while ((i = fis.read(by)) != -1) { // lecture tant qu'il y a encore des bytes à lire
				String str = new String(by, 0, i); // enregistrement temporaire des chaines de 20 caracteres contenues dans by[] dans str
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {  // fermeture du flux FileInputStream 
			if (fis != null)
				fis.close();
		}
	}
}
