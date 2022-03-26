package customexceptions;

public class CheckedCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5528409028921987364L;

	CheckedCustomException(String message) {
		super(message);
	}
}
