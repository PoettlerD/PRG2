package org.campus02.io;

import java.io.IOException;

public class AddressExportException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AddressExportException(IOException e) {
		// TODO Auto-generated constructor stub
		e.printStackTrace();
	}

	public AddressExportException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressExportException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public AddressExportException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public AddressExportException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public AddressExportException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
