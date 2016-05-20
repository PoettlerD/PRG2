package org.campus02.io;

import java.io.IOException;

public class AdressLoadException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4283779990944426871L;

	public AdressLoadException(IOException e) {
		// TODO Auto-generated constructor stub
e.printStackTrace();

}

	public AdressLoadException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdressLoadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AdressLoadException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AdressLoadException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AdressLoadException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
