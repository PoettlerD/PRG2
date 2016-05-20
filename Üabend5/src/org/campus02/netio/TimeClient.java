package org.campus02.netio;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TimeClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub

		Socket sock = new Socket("localhost",1111);
		BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		
		String Data = null;

		while ((Data = br.readLine())!= null)
		{
			
			System.out.println(Data);
			sock.close();
		}
		
		
	}

}
