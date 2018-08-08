package dev.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dev.jpa.Jouet;
import dev.jpa.Livre;
import dev.jpa.Vinyl;

// LISTE DES FONCTIONNALITES :
// * Ajouter un article à la collection
// * Inventaire de la collection
// * Estimation de la collection
// * Modifier un article
// * Sortir un article

public class GestionCollection {

	// DEBUT DE SESSION - OUVERTURE
	EntityManagerFactory emf;
	EntityManager em;

	@Before
	public void setUp() {

		this.emf = Persistence.createEntityManagerFactory("gestion-collection-objets");
		this.em = emf.createEntityManager();
	}

	// TEST INSERTION DE DONNEES
	@Test
	public void inserer_donnees() {

		// Création des variables
		Vinyl vinyl = new Vinyl();
		Livre livre = new Livre();
		Jouet jouet = new Jouet();

		// Insertion de données
		// Vinyl
		vinyl.setReference(reference);
		vinyl.setTitre(titre);
		vinyl.setAuteur(auteur);
		vinyl.setAnneeSortie(anneeSortie);
		vinyl.setFormatObjet(formatObjet);
		vinyl.setPrix(prix);
		vinyl.setLieu(lieu);
		vinyl.setDate(date);
		vinyl.setEtat(etat);
		vinyl.setCote(cote);

		// Livre
		// Jouet

	}

	// AJOUTER UN OBJET A LA COLLECTION
	public void saveNewPizza(Pizza pizza) {
		connexion();
		EntityTransaction transaction = this.em.getTransaction();
		transaction.begin();
		this.em.persist(pizza);
		transaction.commit();
		fermeture();
	}

	// FIN DE SESSION - FERMETURE
	@After
	public void tearDown() {

		em.close();
		emf.close();
	}

}
