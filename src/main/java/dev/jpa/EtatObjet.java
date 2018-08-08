package dev.jpa;

public enum EtatObjet {

	// Enumération des champs de la catégorie ETAT
	EXCELLENT("Excellent"), TRES_BON("Très bon"), BON("Bon"), MOYEN("Moyen"), ABIME("Abimé");

	// Attribut
	private String etat;

	// Getters & Setters
	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	// Constructeur
	private EtatObjet(String etat) {
		this.etat = etat;
	}

}
