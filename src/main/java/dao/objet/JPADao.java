package dao.objet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dev.jpa.Article;

public class JPADao implements IObjetDao {

	// Ouverture de session
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion-collection-objets");

	// -------------- SAUVEGARDER UN NOUVEL OBJET --------------
	@Override
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
	//
	// // -------------- ESTIMATION DE LA COLLECTION --------------
	// // ****ecrire methode*****
	//
	// // Création d'un entity manager
	// EntityManager em = emf.createEntityManager();
	//
	// // Transaction
	// EntityTransaction transaction =
	// em.getTransaction();transaction.begin();em.persist(article);transaction.commit();
	//
	// // Fermeture de l'entity manager
	// em.close();}
	//
	// // -------------- INVENTAIRE DE LA COLLECTION --------------
	// // ****ecrire methode*****
	//
	// // Création d'un entity manager
	// EntityManager em = emf.createEntityManager();
	//
	// // Transaction
	// EntityTransaction transaction =
	// em.getTransaction();transaction.begin();em.persist(article);transaction.commit();
	//
	// // Fermeture de l'entity manager
	// em.close();
	//
	// }
	//
	// // -------------- MODIFIER UN ARTICLE --------------
	// // ****ecrire methode*****
	//
	// // Création d'un entity manager
	// EntityManager em = emf.createEntityManager();
	//
	// // Transaction
	// EntityTransaction transaction =
	// em.getTransaction();transaction.begin();em.persist(article);transaction.commit();
	//
	// // Fermeture de l'entity manager
	// em.close();
	//
	// }
	//
	// // -------------- SORTIR --------------
	// // ****ecrire methode*****
	// public boolean ArticleExists(String reference) throws StockageException;
	//
	// // Création d'un entity manager
	// EntityManager em = emf.createEntityManager();
	//
	// // Requête
	// TypedQuery<Pizza> query = em.createQuery("SELECT a FROM Article a WHERE
	// ref=:verifCode",
	// Article.class);query.setParameter("verifCode",codePizza);
	//
	// if(query.getResultList().isEmpty()){
	//
	// em.close();return false;
	//
	// // Fermeture
	// }else{
	//
	// em.close();
	//
	// return true;}
	//
	// }
	//
	// }

	// Fermeture de session
	public void tearDown() throws Exception {
		emf.close();
	}
}
