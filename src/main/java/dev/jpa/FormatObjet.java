package dev.jpa;

public enum FormatObjet {

	// Enum�ration des champs de la cat�gorie FORMAT
	TOURS33("33 Tours"), TOUR45("Tours 45");

	// Attribut
	private String formatObjet;

	// Getters & Setters
	public String getFormatObjet() {
		return formatObjet;
	}

	public void setFormatObjet(String formatObjet) {
		this.formatObjet = formatObjet;
	}

	// Constructeur
	private FormatObjet(String formatObjet) {
		this.formatObjet = formatObjet;
	}

}
