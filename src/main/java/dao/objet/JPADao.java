package dao.objet;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dev.jpa.Article;

public class JPADao implements IObjetDao {

	// Déclaration de la factory et de l'entity manager
	EntityManagerFactory emf;
	EntityManager em;
	
	
	// -------------- OUVERTURE DE SESSION --------------
	// Connection à appeler dans chaque début de méthode
	public void connexion() {
		emf = Persistence.createEntityManagerFactory("gestion-collection-objets");
		em = emf.createEntityManager();
	}

	
	// -------------- FERMETURE DE SESSION --------------
	// Fermeture à appeler dans chaque fin de méthode
	public void  tearDown() throws Exception {
		emf.close();
		em.close();
	}
	
	// ____________________________DEBUT DU MENU_____________________________________
	
	// -------------- MENU 1. INVENTAIRE DE LA COLLECTION --------------
	

	
	
	// -------------- MENU 2. SAUVEGARDER UN NOUVEL OBJET --------------
	@Override
	public void saveNewArticle(Article article) throws Exception {
		
		// Appel de la connection
		connexion();
		
		// Transaction
		EntityTransaction transaction = this.em.getTransaction();
		transaction.begin();
		this.em.persist(article);
		transaction.commit();

		// Appel de la fermeture de session
		tearDown();
	}
	
	
	
	// -------------- MENU 3. MODIFIER UN ARTICLE --------------
	
	
	
	
	// -------------- MENU 4. SUPPRIMER UN OBJET --------------
	@Override
	public void deleteArticle(String suppr) throws Exception {
	
	// Appel de la connection
	connexion();
	
	// Transaction
	// Requête pour supprimer de la table l'article en fontion de sa référence
	EntityTransaction transaction = this.em.getTransaction();
	transaction.begin();
	
	Query query = em.createQuery("DELETE FROM Article a WHERE a.reference=:referenceA");
	query.setParameter("referenceA", suppr);

	query.executeUpdate();
	
	transaction.commit();
	
	// Appel de la fermeture de session
	tearDown();
	}
	
	// ____________________________FIN DU MENU_____________________________________
	
	
	// -------------- TROUVER UN OBJET --------------
	// Utilisé dans la méthode de suppression d'un objet
	@Override
	public Object findArticlebyReference(String suppr) {
		return null;
	}
	

	
}
