package console.objet;

import java.sql.SQLException;
import java.util.Scanner;

import GestionExceptions.StockageException;
import dao.objet.IObjetDao;

public abstract class MenuService {

	// Signature de méthode, oblige les classes filles à l'utiliser
	abstract void executeUC(Scanner scanner, IObjetDao dao) throws StockageException, SQLException, Exception;

}
