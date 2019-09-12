package fr.formation.inti.fichiers;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LectureFichierPersUTF {

	public static void main(String[] args) throws IOException {

		// déclaration des objets fis et dis
		DataInputStream dis = null;
		
		try {
			// instanciation de l'objet dis qui va permettre de lire le contenu du fichier "testUTF" encodé en UTF-8
			dis = new DataInputStream(new FileInputStream("out/testUTF"));
				
			// 
			while (dis.available() > 0) { // boucle: tant qu'il y a encore des chaines de caracteres à lire
				System.out.println(dis.readUTF()); // lecture et affichage des chaines de caracteres, via readUTF qui lit les caracteres encodés en UTF-8
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {  // fermeture du flux FileInputStream 
			if (dis != null)
				dis.close();
		}
	}
}
