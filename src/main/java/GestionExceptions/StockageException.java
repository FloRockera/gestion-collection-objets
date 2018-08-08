package GestionExceptions;

public class StockageException extends Exception {

	private String msg;

	public StockageException(String msg) {
		super(msg);
	}

}
