package dev.jpa;

public enum CategorieObjet {

	// Enum�ration des champs de la cat�gorie CATEGORIEOBJET
	JOUET("Jouet"), VINYL("Vinyl"), LIVRE("Livre");

	// Attribut
	private String categObjet;

	// Getters & Setters
	public String getCategObjet() {
		return categObjet;
	}

	public void setCategObjet(String categObjet) {
		this.categObjet = categObjet;
	}

	// Constructeur
	private CategorieObjet(String categObjet) {
		this.categObjet = categObjet;
	}

}
