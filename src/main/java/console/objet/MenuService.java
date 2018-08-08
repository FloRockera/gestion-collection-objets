package console.objet;

import java.util.Scanner;

import GestionExceptions.StockageException;
import dao.objet.IObjetDao;

public abstract class MenuService {

	// Signature de m�thode, oblige les classes filles � l'utiliser
	abstract void executeUC(Scanner scanner, IObjetDao dao) throws StockageException;

}
