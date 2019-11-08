package taschenrechner;

@SuppressWarnings("serial")
public class IllegalOperatorException extends RuntimeException {

	public IllegalOperatorException(String message) {
		super(message);
	}
	
}
