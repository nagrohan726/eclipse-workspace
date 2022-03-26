package customexceptions;

public class UncheckedCustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8924232284319697808L;

	UncheckedCustomException(String message) {
		super(message);
	}

}
