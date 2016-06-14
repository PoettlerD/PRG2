package networking.lv.pingpong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class PingPongClient {

	public static void main(String[] args) throws ClientException {
		// TODO Auto-generated method stu
		
	
		try(
				Socket sock = new Socket("localhost", 3333);
				BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
				BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
				)
	
	{
			String Data;
			
			while(!(Data = console.readLine()).equals("quit"))
			{

				bw.write(Data);
				bw.newLine();
				bw.flush();
				
			//	String answer ;
		//		while((answer = br.readLine())!= null)
			//	{
				//	System.out.println(answer);
					//break;
				System.out.println(br.readLine());
				//}
			}
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		throw new ClientException(e);
		
	}
		}
	
	}
