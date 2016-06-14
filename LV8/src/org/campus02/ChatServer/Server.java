package org.campus02.ChatServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;


public class Server {

	public static void main(String[] ssargs) {
		// TODO Auto-generated method stub
		 ArrayList<ChatClient> connectedClients = new ArrayList<>();
		 
		 try(ServerSocket srvSock = new ServerSocket(12345);)
		 {
			 ChatClient.Logfile =  new FileWriter(new File("C:\\Temp\\ChatLog.txt"),true);
			 while(true)
			 {
			 Socket clientSocket = srvSock.accept();
			 
			 Thread th = new Thread(new ChatClient(connectedClients,clientSocket));
			 th.start();
			 
			 }
		 }
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			try {
				ChatClient.Logfile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 		

	}

}
