package dev.jpa;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Vinyl extends Article {

	// Attributs - Colonnes

	// // Categorie pour différencier les types d'objets
	// @Enumerated(EnumType.ORDINAL)
	// private CategorieObjet categObjet;

	private String titre;

	private String auteur;

	@Enumerated(EnumType.ORDINAL)
	private FormatObjet formatObjet;

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

	public FormatObjet getFormatObjet() {
		return formatObjet;
	}

	public void setFormatObjet(FormatObjet formatObjet) {
		this.formatObjet = formatObjet;
	}

	// Constructeur
	public Vinyl(String titre, String auteur, FormatObjet formatObjet) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.formatObjet = formatObjet;
	}

	// Constructeur vide JPA
	public Vinyl() {
		super();
	}

	public Vinyl(int ref, String titre2, String auteur2, String format, String prix, String lieu,
			String dateAchatFormatV, String etat, String cote) {
		// TODO Auto-generated constructor stub
	}

	// Methode toString
	@Override
	public String toString() {
		return "Vinyl [titre=" + titre + ", auteur=" + auteur + ", formatObjet=" + formatObjet + "]";
	}

}
