package dev.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre extends Article {

	// Categorie pour différencier les types d'objets
	@Column(name = "CATEGORIE")
	@Enumerated(EnumType.ORDINAL)
	private CategorieObjet categObjet;

	// Attributs - Colonnes
	@Column(name = "TITRE")
	private String titre;

	@Column(name = "AUTEUR")
	private String auteur;

	@Column(name = "EDITEUR")
	private String editeur;

	// Getters & Setters
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	// Construteur
	public Livre(CategorieObjet categObjet, String titre, String auteur, String editeur) {
		super();
		this.categObjet = categObjet;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
	}

	// Construteur vide JPA
	public Livre() {
		super();
	}

	public Livre(String nref, String titre2, String auteur2, String editeur2, String annee, String prix, String lieu,
			String dateAchatFormatV, String etat, String cote) {
		// TODO Auto-generated constructor stub
	}

	public Livre(int ref, String titre2, String auteur2, String editeur2, String annee, String prix, String lieu,
			String dateAchatFormatV, String etat, String cote) {
		// TODO Auto-generated constructor stub
	}

	// Methode toString
	@Override
	public String toString() {
		return "Livre [categObjet=" + categObjet + ", titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur
				+ "]";
	}

}
