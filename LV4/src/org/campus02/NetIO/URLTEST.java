package org.campus02.NetIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTEST {

	public static void main(String[] args)  {

		// TODO Auto-generated method stub

		try(
	
	BufferedReader br = new BufferedReader(new InputStreamReader(new URL("http://chris.com/ascii/index.php?art=places/maps").openStream()));
	BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\TEMP\\Wiki.html",true));
				)
		{
	
	String Data;
	while((Data=br.readLine())!= null)
	{
		System.out.println(Data);
		bw.write(Data);
	}
	bw.flush();

		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	

}
