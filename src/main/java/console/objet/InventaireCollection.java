package console.objet;

import java.sql.SQLException;
import dev.jpa.*;

import java.util.ArrayList;
import java.util.Scanner;

import dao.objet.IObjetDao;

public class InventaireCollection {

	public void executeUC(Scanner scan, IObjetDao dao) throws SQLException {
		// TODO Auto-generated method stub

		ArrayList<Article> articles = dao.findAllArticles();

		for (int i = 0; i < articles.size(); i++) {

			System.out.println(articles.get(i));
		}

		
		}
		
	}

