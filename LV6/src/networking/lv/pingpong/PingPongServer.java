package networking.lv.pingpong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class PingPongServer {

	public static void main(String[] args) throws ServerException {
		// TODO Auto-generated method stub


		try(ServerSocket srvSock = new ServerSocket(3333);)
		{
			while(true)
			{
			Socket sock = srvSock.accept();
			System.out.println("Socket Accepted");
			process(sock);
			System.out.println("Socket Closed");
			}
			
		} 
		catch (SocketException e)
		{
			throw new ServerException(e);
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private static void process(Socket client) throws ServerException
	{

		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				)
	
				
		{
			String Data;
			while((Data = br.readLine())!= null)
			{
				if (Data.equals("ping"))
				{
					bw.write("pong");
					bw.newLine();
					bw.flush();
					
					
				}
				else if (Data.equals("pong"))
				{
					bw.write("ping");
					bw.newLine();
					bw.flush();
					
				}
				else
				{
					bw.write("error");
					bw.newLine();
					bw.flush();	
				}
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new ServerException(e);
			
		}

		
	}
}
