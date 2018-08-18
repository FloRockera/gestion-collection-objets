package dao.objet;

import java.sql.SQLException;

import console.objet.ArrayList;
import dev.jpa.Article;

public interface IObjetDao extends AutoCloseable {

	// ***** Lister ici les methodes de l'application *****

	// Sauvegarder un nouvel article
	void saveNewArticle(Article article) throws SQLException, Exception;

	// Trouver un article grâce à sa référence
	// Utilisé dans l'option de suppression d'un article
	Object findArticlebyReference(String suppr);

	// Supprimer un article
	void deleteArticle(String suppr) throws SQLException, Exception;

	// Fermeture
	default void close() {
	}

	// Inventaire
	ArrayList<Article> findAllArticles();

	// Modifier un article
	void updateArticle(Article newLivre);
}
