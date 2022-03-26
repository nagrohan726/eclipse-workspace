package exceptionhandling;

public class MyThreadException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8403730197438999999L;

	public MyThreadException() {

	}

	public MyThreadException(String message) {
		super(message);
	}

}
