package org.campus02.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File fl = new File("C:\\Temp\\TESTCSV.CSV");
		FileReader fir = new FileReader(fl);
		BufferedReader br = new  BufferedReader(fir);
		
		String data;
		String Output = "";
		while ((data=br.readLine()) != null) {
		
			/*
			 * Sting[] parts = line.split(";");
			 * for (int i = 0; i< parts.length; i++)
			 * {
			 * sysout(ausgabe)
			 * 
			 */
			
			
			for (char c : data.toCharArray()) {
				
				if (c != ';')
				{
					Output += c;
				}
				else
				{
					Output += "\n";
				}
			}
			
		}
		br.close();
		fir.close();
		System.out.println(Output);
		Output = null;
	}

}
