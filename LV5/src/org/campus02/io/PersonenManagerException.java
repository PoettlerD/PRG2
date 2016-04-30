package org.campus02.io;

import java.io.FileNotFoundException;

public class PersonenManagerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonenManagerException(FileNotFoundException e) {
		// TODO Auto-generated constructor stub
		System.out.println("Datei nicht gefunden");
	}

}
