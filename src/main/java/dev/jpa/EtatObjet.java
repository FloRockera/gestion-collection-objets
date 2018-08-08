package dev.jpa;

public enum EtatObjet {

	// Enum�ration des champs de la cat�gorie ETAT
	EXCELLENT("Excellent"), TRES_BON("Tr�s bon"), BON("Bon"), MOYEN("Moyen"), ABIME("Abim�");

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
