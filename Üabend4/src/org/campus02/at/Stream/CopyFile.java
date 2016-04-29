package org.campus02.at.Stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File readFile = new File("C:\\Temp\\Text.txt");
		FileInputStream fis = new FileInputStream(readFile);
		File outFile = new File("C:\\Temp\\OutFile.txt");
		FileOutputStream fos = new FileOutputStream(outFile);
		
		int data;
		while((data=fis.read()) != -1)
		{
			fos.write(data);
		}
		fis.close();
		fos.flush();
		fos.close();
		
	}

}
