package console.objet;

import java.sql.SQLException;
import java.util.Scanner;

import GestionExceptions.StockageException;
import dao.objet.IObjetDao;
import dao.objet.JPADao;
import dev.jpa.Article;

public class MainConsole {

	public static void main(String[] args) throws StockageException, SQLException {

		Scanner scan = new Scanner(System.in);

		int choix = 0;
		Article article;

		IObjetDao dao = new JPADao();

		// Saisir un choix sur le menu principal
		do {
			System.out.println(
					"***** GESTION DE COLLECTION D'OBJETS ***** \n 1. Inventaire de la collection \n 2. Ajouter un nouvel article \n 3. Modifier un article de la collection \n 4. Suppression d'un article de la collection \n 99. Sortir");
			choix = scan.nextInt();

			switch (choix) {

			// INVENTAIRE
			case 1:
				InventaireCollection inventaire = new InventaireCollection();
				inventaire.executeUC(scan, dao);
				break;

			// AJOUT
			case 2:
				AjouterObjet ajout = new AjouterObjet();
					try {
						ajout.executeUC(scan, dao);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				break;

			// MODIFICATION
			case 3:
				ModifierObjet modification = new ModifierObjet();
				modification.executeUC(scan, dao);
				break;

			// SUPPRESSION
			case 4:
				SupprimerObjet suppression = new SupprimerObjet();
				try {
					suppression.executeUC(scan, dao);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;

			// SORTIR
			case 99:
				System.out.println("Merci ! \nAu revoir.");
				break;

			default:
				System.out.println("Cette option de menu n'existe pas");
				break;

			}
		} while (choix != 99);

		scan.close();

	}

}
