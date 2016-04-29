package org.campus02.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		File fl = new File("C:\\Temp\\Rename.txt");
		FileReader fir = new FileReader(fl);
		BufferedReader br = new  BufferedReader(fir);
		
		String data;
		while ((data=br.readLine()) != null) {
			System.out.println(data);
			
		}
		br.close();
		fir.close();
		
	}

}
