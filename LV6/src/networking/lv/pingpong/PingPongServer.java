package networking.lv.pingpong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class PingPongServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		while(true)
		{
			ServerSocket srvSock = new ServerSocket(3333);
			Socket sock = srvSock.accept();
					try(
				BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				)
		{}
		}
	}

}
