package exceptionhandling;

public class MyThreadException extends RuntimeException {

	public MyThreadException() {

	}

	public MyThreadException(String message) {
		super(message);
	}

}
