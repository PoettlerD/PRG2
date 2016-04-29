package org.campus02.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class IO2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		writeObject("Hallo Welt");
		System.out.println("Gelesener Wert");
		readObject("C:\\temp\\object.dat");
	}

	
	public static void writeObject(String text) throws IOException
	{
	File file = new File("C:\\temp\\object.dat");
	FileOutputStream fos = new FileOutputStream(file);
	ObjectOutput oos = new ObjectOutputStream(fos);
	oos.writeObject(text);
	oos.flush();
	
	}
	
	public static void readObject(String path) throws IOException, ClassNotFoundException
	{
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		String inputText = (String) ois.readObject();

			System.out.println(inputText);
			ois.close();
		
		
		
	}
}
