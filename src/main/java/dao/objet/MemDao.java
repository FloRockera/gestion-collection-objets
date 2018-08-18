package dao.objet;

import java.sql.SQLException;
import java.util.ArrayList;

import dev.jpa.Article;

public class MemDao implements IObjetDao {

	// Ajouter un article
	@Override
	public void saveNewArticle(Article article) {
		// TODO Auto-generated method stub

	}

	// Trouver un article
	@Override
	public Object findArticlebyReference(String suppr) {
		// TODO Auto-generated method stub
		return null;
	}

	// Supprimer un article
	@Override
	public void deleteArticle(String suppr) throws SQLException, Exception {
		// TODO Auto-generated method stub
		
	}

	// Inventaire
	@Override
	public ArrayList <Article> findAllArticles() {
		// TODO Auto-generated method stub
		return null;
	}

	// Modifier article
	@Override
	public void updateArticle(Article newLivre) {
		// TODO Auto-generated method stub
		
	}

	
}
