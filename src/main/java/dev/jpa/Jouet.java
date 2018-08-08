package dev.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "jouet")
public class Jouet extends TypeObjet {

	// Attributs - Colonnes
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REF")
	private Integer reference;

	// Categorie pour différencier les types d'objets
	@Column(name = "CATEGORIE")
	@Enumerated(EnumType.ORDINAL)
	private CategorieObjet categObjet;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "FABRIQUANT")
	private String fabriquant;

	@Column(name = "CATEGORIE")
	private String categ;

	// Getters & Setters
	public Integer getReference() {
		return reference;
	}

	public void setReference(Integer reference) {
		this.reference = reference;
	}

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

	// Methode toString
	@Override
	public String toString() {
		return "Jouet [reference=" + reference + ", nom=" + nom + ", fabriquant=" + fabriquant + ", categ=" + categ
				+ "]";
	}

	public Jouet(Integer reference, CategorieObjet categObjet, String nom, String fabriquant, String categ) {
		super();
		this.reference = reference;
		this.categObjet = categObjet;
		this.nom = nom;
		this.fabriquant = fabriquant;
		this.categ = categ;
	}

}
