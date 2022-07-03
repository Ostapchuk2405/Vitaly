package edu.javacourse.contact.exception;

public class ContactBusinessException extends Exception {

	public ContactBusinessException() {
		super();
	}

	public ContactBusinessException(String message) {
		super(message);
	}

	public ContactBusinessException(Throwable cause) {
		super(cause);
	}

	public ContactBusinessException(String message, Throwable cause) {
		super(message, cause);
	}

}
