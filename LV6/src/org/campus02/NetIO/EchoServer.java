package org.campus02.NetIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;

public class EchoServer {

	public static void main(String[] args) throws IOException, toManyConnectionsException {
		// TODO Auto-generated method stub

		ServerSocket srvSock = new ServerSocket(2222);
		HashMap<String, Integer> IpConnectCount = new HashMap<>();
		while (true)
		{
			Socket sock = srvSock.accept();

			try(
					BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
					)
			{
				if (!(IpConnectCount.containsKey(sock.getInetAddress().toString())))
				{
						IpConnectCount.put(sock.getInetAddress().toString(), 1);
					

				}
				
				if ((IpConnectCount.get(sock.getInetAddress().toString()) > 3))
				{
					
					sock.close();
					
					
				}
				String Data;
				
				while ((Data = br.readLine())!= null)
				{
					/*if (Data.equals("quit"))
					{
						sock.close();
					}*/
					System.out.println("Empfangen: " +Data);
					bw.write(Data);
					bw.newLine();
					bw.flush();
					System.out.println("Gesendet: " +Data);
				}
				IpConnectCount.put(sock.getInetAddress().toString(), (IpConnectCount.get(sock.getInetAddress().toString()))+1);
			}
		
		catch(SocketException e )
		{
			if (IpConnectCount.get(sock.getInetAddress().toString()) >= 3)
				throw new toManyConnectionsException(e);
			e.printStackTrace();
		}
		}
	}
		
		}


