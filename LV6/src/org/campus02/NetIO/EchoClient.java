package org.campus02.NetIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				Socket sock = new Socket("localhost", 2222);
				BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
				BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
				)
		
		{
			
			String datawrite = null;
			String dataread;
			while (!(dataread = console.readLine()).equals("quit") )
			{
				datawrite = datawrite + dataread;
			
			bw.write(dataread);
			bw.newLine();
			bw.flush();
			String Data;
			while ((Data = br.readLine())!= null)
			{
				System.out.println(Data);
				break;
			}
			}
			}
			
		 catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


