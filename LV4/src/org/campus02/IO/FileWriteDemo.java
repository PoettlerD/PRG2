package org.campus02.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import jdk.nashorn.internal.ir.CatchNode;

public class FileWriteDemo {
	
	public static void main (String[] args)
	{
		File f = new File("C:\\Temp\\FileWriterDemo.txt");
	//	FileWriter fw =null;
	//	PrintWriter pw =null;
	//	BufferedReader br =null;
		InputStreamReader ips=new InputStreamReader(System.in);
		
		
		try (
				FileWriter fw = new FileWriter(f);
				BufferedReader br = new BufferedReader(ips);
				PrintWriter pw = new PrintWriter(fw);
				)
		{		
	//pw.println("Zeile 1");
	//pw.println("Zeile 2");

	
	
	String data;
	while(!(data = br.readLine()).equals("Stop") )
	{
		pw.println(data);
	}
	pw.flush();

	}
	
	catch(FileNotFoundException ex)
		{
		ex.printStackTrace();
		System.out.println("Die Datei existiert nicht!!!!!!");
		}
		catch (IOException ex) {
			// TODO: handle exception
			ex.printStackTrace();
			
		}

}
}
