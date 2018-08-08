package dev.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre extends TypeObjet {

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

	@Column(name = "EDITEUR")
	private String editeur;

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

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	// Methode toString
	@Override
	public String toString() {
		return "Livre [reference=" + reference + ", titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur
				+ "]";
	}

	// Construteur
	public Livre() {
		super();
	}

}
