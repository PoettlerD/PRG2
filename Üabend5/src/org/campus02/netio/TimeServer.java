package org.campus02.netio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket srvSock = new ServerSocket(1111);
		while (true)
		{
		Socket sock = srvSock.accept();
		
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			LocalDateTime datetime = LocalDateTime.now();
			bw.write(datetime.toString());
			bw.flush();
			
		}
		}
		
	

}
