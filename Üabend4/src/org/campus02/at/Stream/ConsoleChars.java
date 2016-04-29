package org.campus02.at.Stream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import com.sun.org.apache.xpath.internal.axes.FilterExprWalker;

public class ConsoleChars {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = OpenStream();
		BufferedOutputStream bos = new BufferedOutputStream(fos);
	//Reader in = new InputStreamReader(System.in); //Textbasiert lesen
	//char read = 0;
//	do{
		
	
//	read = (char)System.in.read();
	/*BufferedReader consoleReader = new BufferedReader(in); //Zeilenbasiert lesen
	String line = consoleReader.readLine();*/
	//fos.write(read);
//	bos.write(read);
//	}
//	while(read!='x');
//	bos.flush();
//	bos.close();
//	fos.flush();
//	fos.close();
	
//Wie es laut Folien gemacht werden soll
	
	int data=0;
	
	//data=System.in.read() == Zuweisung auf Data und vergleicht ob data != -1 --> Steam leer
	while((data=System.in.read())!=-1)
	{
		if('x'==data)
			break;
		bos.write(data);
	}
	bos.flush();
	bos.close();
	}

	private static FileOutputStream OpenStream() throws FileNotFoundException {
		File outFile = new File("C:\\Temp\\chars.txt");
		FileOutputStream fos = new FileOutputStream(outFile);
		return fos;
	}
	
}
