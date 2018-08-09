package dao.objet;

import dev.jpa.Article;

public interface IObjetDao extends AutoCloseable {

	// Lister les methodes de l'appli

	// Sauvegarder un nouvel article
	void saveNewArticle(Article article);

	default void close() {

	}

}
