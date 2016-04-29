package org.campus02.at.Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

public class Streamapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		File file = new File("C:\\Temp\\Text.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
	
	//	ObjectOutputStream oos = new ObjectOutputStream(fos);
		OutputStreamWriter writer = new OutputStreamWriter(fos, "UTF8");
		writer.write("Mimi spielt Ball und mag Äpfel");
		writer.flush();
		writer.close();
		//oos.close();
		fos.close();*/
		
		File outfile = new File("C:\\Temp\\Text.txt");
		System.out.println(outfile.exists());
		System.out.println(outfile.getAbsolutePath());
		System.out.println(outfile.getName());
		System.out.println(outfile.canWrite());
		try {
			WriteText(outfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void WriteText(File outfile)throws IOException {
		FileWriter writer = null;
		try {
			writer = new FileWriter(outfile);
			writer.write("Mimi spielt Ball und mag Äpfel");
			
			writer.flush();
			
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			writer.close();
			System.out.println("bye");
		}
	}

}
