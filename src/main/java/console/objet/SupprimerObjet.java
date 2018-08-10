package console.objet;

import java.sql.SQLException;
import java.util.Scanner;

import GestionExceptions.DeleteObjetException;
import dao.objet.IObjetDao;

public class SupprimerObjet extends MenuService {

	public void executeUC(Scanner scanner, IObjetDao dao) throws Exception {
		System.out.println("Veuillez choisir la référence à supprimer");
		String suppr = scanner.next().toUpperCase();

		if (dao.findArticlebyReference(suppr) == null ) {
			throw new DeleteObjetException("Veuillez saisir une référence existante");
		}
		dao.deleteArticle(suppr);
	}

}
