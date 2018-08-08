package console.objet;

import java.util.Scanner;

import GestionExceptions.SaveObjetException;
import dao.objet.IObjetDao;
import dev.jpa.CategorieObjet;
import dev.jpa.FormatObjet;
import dev.jpa.Jouet;
import dev.jpa.Livre;
import dev.jpa.Vinyl;

public class AjouterObjet extends MenuService {

	// Attributs Jouets
	private int typeCateg;
	private Integer reference;
	private CategorieObjet categObjet;
	private String nom;
	private String fabriquant;
	private String categ;
	private Jouet newJouet;

	// Attributs Livre
	private String editeur;
	private Livre newLivre;

	// Attributs Vinyl
	private String titre;
	private String auteur;
	private FormatObjet formatObjet;
	private Vinyl newVinyl;

	@Override
	public void executeUC(Scanner scan, IObjetDao dao) throws SaveObjetException {

		System.out.println("Ajout d'un nouvel objet à votre collection");
		System.out.println("Veuillez sélectionner le type d'objet à insérer :\n 1) JOUET, \n 2) VINYL, \n 3)LIVRE");
		int typeCateg = scan.nextInt();

		if (typeCateg == 1) {

			newJouet = new Jouet(reference, categObjet, nom, fabriquant, CategorieObjet.valueOf("JOUET"));
		} else if (typeCateg == 2) {
			newLivre = new Livre(reference, titre, auteur, editeur, CategorieObjet.valueOf("LIVRE"));
		} else if (typeCateg == 3) {
			newVinyl = new Vinyl(reference, titre, auteur, FormatObjet.valueOf(categ), CategorieObjet.valueOf("VINYL"));
		} else {
			throw new SaveObjetException("Ceci n'est pas une catégorie valable");
		}

		dao.saveNewJouet(newJouet);

	}

}
