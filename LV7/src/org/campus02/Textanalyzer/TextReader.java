package org.campus02.Textanalyzer;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {

	private ArrayList<String> Even = new ArrayList<>();
	private ArrayList<String> Odd = new ArrayList<>();
	private File textfile;
	
	
	public TextReader(File textfile) {
		super();
		this.textfile = textfile;
	}
	
	
	
	public ArrayList<String> getEven() {
		return Even;
	}



	public ArrayList<String> getOdd() {
		return Odd;
	}



	public void Textanalyze() throws FileNotFoundException, IOException
	{
		try(
	BufferedReader br = new BufferedReader(new FileReader(textfile)))
		
		{
			int counter = 1;
			String Line;
			
			while((Line = br.readLine())!= null)
			{
				if(counter%2 != 0)
				{
					Odd.add(Line);
					
				}
				else
				{
					Even.add(Line);
				}
				counter++;
				
			}
		}
				
	
	
	}




	
	
}
