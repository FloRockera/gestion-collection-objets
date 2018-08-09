package console.objet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import GestionExceptions.SaveObjectException;
import dao.objet.IObjetDao;
import dev.jpa.Article;
import dev.jpa.Jouet;
import dev.jpa.Livre;
import dev.jpa.Vinyl;

public class AjouterObjet extends MenuService {

	@Override
	public void executeUC(Scanner scan, IObjetDao dao) throws SaveObjectException {

		System.out.println("Ajout d'un nouvel objet à votre collection");
		System.out.println("Veuillez sélectionner le type d'objet à insérer :\n 1. JOUET \n 2. VINYL \n 3. LIVRE");
		int typeCateg = scan.nextInt();

		// CategorieObjet etat = new CategorieObjet();

		// si l'utilisateur rentre un nouveau JOUET
		if (typeCateg == 1) {
			System.out.println("VOUS ETES DANS LA CATEGORIE JOUET ANCIEN");
			System.out.println("Veuillez saisir la référence : ");
			int ref = scan.nextInt();
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
			// Nouveau JOUET
			Article newJouet = new Jouet(ref, nom, fab, categ, annee, prix, lieu, dateAchatFormatV, etat, cote);
			dao.saveNewArticle(newJouet);

			// si l'utilisateur rentre un nouveau VINYL
		} else if (typeCateg == 2) {
			System.out.println("VOUS ETES DANS LA CATEGORIE VINYL");
			System.out.println("Veuillez saisir la référence : ");
			int ref = scan.nextInt();
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
			// Nouveau VINYL
			Article newVinyl = new Vinyl(ref, titre, auteur, format, prix, lieu, dateAchatFormatV, etat, cote);
			dao.saveNewArticle(newVinyl);

			// si l'utilisateur rentre un nouveau LIVRE
		} else if (typeCateg == 3) {
			System.out.println("VOUS ETES DANS LA CATEGORIE LIVRE");
			System.out.println("Veuillez saisir la référence : ");
			int ref = scan.nextInt();
			System.out.println("Veuillez saisir le titre : ");
			String titre = scan.next();
			System.out.println("Veuillez saisir le nom de l'auteur : ");
			String auteur = scan.next();
			System.out.println("Veuillez saisir le nom de l'éditeur : ");
			String editeur = scan.next();
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
			// Nouveau LIVRE
			Article newLivre = new Livre(ref, titre, auteur, editeur, annee, prix, lieu, dateAchatFormatV, etat, cote);
			dao.saveNewArticle(newLivre);

		} else {
			throw new SaveObjectException("Ceci n'est pas une catégorie valable");
		}

		scan.close();
	}

}
