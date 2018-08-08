package dev.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "vinyl")
public class Vinyl extends TypeObjet {

	// Attributs - Colonnes
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REF")
	private Integer reference;

	// Categorie pour différencier les types d'objets
	@Column(name = "CATEGORIE")
	@Enumerated(EnumType.ORDINAL)
	private CategorieObjet categObjet;

	@Column(name = "TITRE")
	private String titre;

	@Column(name = "AUTEUR")
	private String auteur;

	@Column(name = "FORMAT")
	@Enumerated(EnumType.ORDINAL)
	private FormatObjet formatObjet;

	// Getters & Setters
	public Integer getReference() {
		return reference;
	}

	public void setReference(Integer reference) {
		this.reference = reference;
	}

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

	// Methode toString
	@Override
	public String toString() {
		return "Vinyl [reference=" + reference + ", titre=" + titre + ", auteur=" + auteur + ", formatObjet="
				+ formatObjet + "]";
	}

}
