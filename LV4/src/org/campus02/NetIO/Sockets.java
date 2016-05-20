package org.campus02.NetIO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Sockets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				Socket test = new Socket("news.orf.at", 80);
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(test.getOutputStream()));
				BufferedReader br = new BufferedReader(new InputStreamReader(test.getInputStream()));
				)
		{
		bw.write("GET / HTTP/1.1 \r\nHost: news.orf.at\r\n\r\n");
		bw.flush();
		String Data;
		while((Data=br.readLine())!= null)
		{
			System.out.println(Data);
		}
		
		}
	
		catch (IOException e) {
			// TODO: handle exception
		}
	}

}
