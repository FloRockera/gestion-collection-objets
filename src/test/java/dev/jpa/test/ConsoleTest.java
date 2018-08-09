package dao.objet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Test;

import dao.objet.IObjetDao;
import dev.jpa.Article;

public class ConsoleTest implements IObjetDao {

	// Ouverture de session
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion-collection-objets");

	// SAUVEGARDER UN NOUVEL OBJET
	@Test
	public void saveNewArticle(Article article) {

		// Création d'un entity manager
		EntityManager em = emf.createEntityManager();

		// Transaction
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(article);
		transaction.commit();

		// Fermeture de l'entity manager
		em.close();

	}

	// Fermeture de session
	@After
	public void tearDown() {
		emf.close();
	}
}
