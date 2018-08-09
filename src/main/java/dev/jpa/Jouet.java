package dev.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Jouet extends Article {

	// Categorie pour différencier les types d'objets
	// @Column(name = "CATEGORIE")
	// @Enumerated(EnumType.ORDINAL)
	// private CategorieObjet categObjet;

	// Attributs - Colonnes
	@Column(name = "NOM")
	private String nom;

	@Column(name = "FABRIQUANT")
	private String fabriquant;

	@Column(name = "CATEGORIE")
	private String categ;

	// Getters & Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFabriquant() {
		return fabriquant;
	}

	public void setFabriquant(String fabriquant) {
		this.fabriquant = fabriquant;
	}

	public String getCateg() {
		return categ;
	}

	public void setCateg(String categ) {
		this.categ = categ;
	}

	// Constructeur
	public Jouet(String nom, String fabriquant, String categ) {
		super();
		this.nom = nom;
		this.fabriquant = fabriquant;
		this.categ = categ;
	}

	// Constructeur vide JPA
	public Jouet() {
		super();
	}

	public Jouet(int ref, String nom2, String fab, String categ2, String annee, String prix, String lieu,
			String dateAchatFormatV, String etat, String cote) {
		// TODO Auto-generated constructor stub
	}

	// Methode toString
	@Override
	public String toString() {
		return "Jouet [nom=" + nom + ", fabriquant=" + fabriquant + ", categ=" + categ + "]";
	}

}
