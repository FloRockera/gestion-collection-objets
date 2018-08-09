package dev.jpa;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Article")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Article {

	// Attributs - Colonnes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REF")
	private Integer reference;

	@Column(name = "ANNEE_SORTIE")
	private LocalDateTime anneeSortie;

	@Column(name = "PRIX")
	private Double prix;

	@Column(name = "LIEU")
	private String lieu;

	@Column(name = "DATE")
	private LocalDateTime date;

	@Column(name = "ETAT")
	@Enumerated(EnumType.ORDINAL)
	private EtatObjet etat;

	@Column(name = "COTE")
	private Double cote;

	// Getters & Setters
	public LocalDateTime getAnneeSortie() {
		return anneeSortie;
	}

	public void setAnneeSortie(LocalDateTime anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public EtatObjet getEtat() {
		return etat;
	}

	public void setEtat(EtatObjet etat) {
		this.etat = etat;
	}

	public Double getCote() {
		return cote;
	}

	public void setCote(Double cote) {
		this.cote = cote;
	}

	// Methode toString
	@Override
	public String toString() {
		return "Details [anneeSortie=" + anneeSortie + ", prix=" + prix + ", lieu=" + lieu + ", date=" + date
				+ ", etat=" + etat + ", cote=" + cote + "]";
	}

}
