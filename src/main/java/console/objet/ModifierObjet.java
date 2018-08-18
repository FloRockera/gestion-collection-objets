package console.objet;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import GestionExceptions.SaveObjectException;
import GestionExceptions.UpdateObjectException;
import dao.objet.IObjetDao;
import dev.jpa.Article;
import dev.jpa.Jouet;
import dev.jpa.Livre;
import dev.jpa.Vinyl;

public class ModifierObjet extends MenuService {

	public void executeUC(Scanner scan, IObjetDao dao) throws SQLException, UpdateObjectException {
		System.out.println("Modification d'un objet de votre collection");
		System.out.println("Veuillez sélectionner le type d'objet à modifier :\n 1. JOUET \n 2. VINYL \n 3. LIVRE");
		int typeCateg = scan.nextInt();

		// Si l'utilisateur modifie un JOUET
		if (typeCateg == 1) {
			System.out.println("VOUS ETES DANS LA CATEGORIE JOUET ANCIEN");
			System.out.println("Veuillez saisir le code de l'article à modifier :");
			String ref = scan.next().toUpperCase();

			System.out.println("Veuillez saisir le nom : ");
			String nom = scan.next();
			System.out.println("Veuillez saisir le nom du fabriquant : ");
			String fab = scan.next();
			System.out.println("Veuillez saisir la catégorie : ");
			String categ = scan.next();
			System.out.println("Veuillez saisir l'année de sortie : ");
			String annee = scan.next();
			System.out.println("Veuillez saisir le prix d'achat : ");
			String prix = scan.next();
			System.out.println("Veuillez saisir le lieu d'achat : ");
			String lieu = scan.next();
			System.out.println("Veuillez saisir la date d'achat (dd/MM/yyyy) : ");
			String date = scan.next();
			DateTimeFormatter formatterV = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate localDateV = LocalDate.parse(date, formatterV);
			String dateAchatFormatV = formatterV.format(localDateV);

			String etat;
			do {
				System.out.println(
						"Veuillez saisir l'état parmi les suivants :\nEXCELLENT \nTRES_BON \nBON \nMOYEN \nABIME ");
				etat = scan.next();
			} while (!etat.equals("EXCELLENT") && !etat.equals("TRES_BON") && !etat.equals("BON")
					&& !etat.equals("MOYEN") && !etat.equals("ABIME"));

			System.out.println("Veuillez saisir la côte de l'objet : ");
			String cote = scan.next();

			// Modification JOUET
			Article newJouet = new Jouet(ref, nom, fab, categ, annee, prix, lieu, dateAchatFormatV, etat, cote);
			dao.updateArticle(newJouet);

			// si l'utilisateur modifie un VINYL
		} else if (typeCateg == 2) {
			System.out.println("VOUS ETES DANS LA CATEGORIE VINYL");
			System.out.println("Veuillez saisir le code de l'article à modifier :");
			String ref = scan.next().toUpperCase();
			
			System.out.println("Veuillez saisir le titre : ");
			String titre = scan.next();
			System.out.println("Veuillez saisir le nom de l'auteur : ");
			String auteur = scan.next();
			System.out.println("Veuillez saisir le format :\n TOURS33 \nTOURS45");
			String format = scan.next();
			System.out.println("Veuillez saisir le prix d'achat : ");
			String prix = scan.next();
			System.out.println("Veuillez saisir le lieu d'achat : ");
			String lieu = scan.next();
			System.out.println("Veuillez saisir la date d'achat (dd/MM/yyyy) : ");
			String date = scan.next();
			DateTimeFormatter formatterV = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate localDateV = LocalDate.parse(date, formatterV);
			String dateAchatFormatV = formatterV.format(localDateV);

			String etat;
			do {
				System.out.println(
						"Veuillez saisir l'état parmi les suivants :\nEXCELLENT \nTRES_BON \nBON \nMOYEN \nABIME ");
				etat = scan.next();
			} while (!etat.equals("EXCELLENT") && !etat.equals("TRES_BON") && !etat.equals("BON")
					&& !etat.equals("MOYEN") && !etat.equals("ABIME"));

			System.out.println("Veuillez saisir la côte de l'objet : ");
			String cote = scan.next();

			// Modification VINYL
			Article newVinyl = new Vinyl(ref, titre, auteur, format, prix, lieu, dateAchatFormatV, etat, cote);
			dao.updateArticle(newVinyl);

			// Si l'utilisateur modifie un LIVRE
		} else if (typeCateg == 3) {
			System.out.println("VOUS ETES DANS LA CATEGORIE LIVRE");
			System.out.println("Veuillez saisir le code de l'article à modifier :");
			String nref = scan.next().toUpperCase();
			
			System.out.println("Veuillez saisir le titre : ");
			String ntitre = scan.next();
			System.out.println("Veuillez saisir le nom de l'auteur : ");
			String nauteur = scan.next();
			System.out.println("Veuillez saisir le nom de l'éditeur : ");
			String nediteur = scan.next();
			System.out.println("Veuillez saisir l'année de sortie : ");
			String nannee = scan.next();
			System.out.println("Veuillez saisir le prix d'achat : ");
			String nprix = scan.next();
			System.out.println("Veuillez saisir le lieu d'achat : ");
			String nlieu = scan.next();
			System.out.println("Veuillez saisir la date d'achat (dd/MM/yyyy) : ");
			String date = scan.next();
			DateTimeFormatter formatterV = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate localDateV = LocalDate.parse(date, formatterV);
			String dateAchatFormatV = formatterV.format(localDateV);

			String etat;
			do {
				System.out.println(
						"Veuillez saisir l'état parmi les suivants :\nEXCELLENT \nTRES_BON \nBON \nMOYEN \nABIME ");
				etat = scan.next();
			} while (!etat.equals("EXCELLENT") && !etat.equals("TRES_BON") && !etat.equals("BON")
					&& !etat.equals("MOYEN") && !etat.equals("ABIME"));

			System.out.println("Veuillez saisir la côte de l'objet : ");
			String cote = scan.next();
			
			// Modification LIVRE
			Article newLivre = new Livre(nref, ntitre, nauteur, nediteur, nannee, nprix, nlieu, dateAchatFormatV, etat, cote);
			dao.updateArticle(newLivre);

		} else {
			throw new UpdateObjectException("Ceci n'est pas une catégorie valable");
		}

		scan.close();
	}


}

