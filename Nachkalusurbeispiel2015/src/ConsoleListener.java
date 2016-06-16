import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class ConsoleListener implements Runnable {

	private ServerSocket srvSock;
	
	
	public ConsoleListener(ServerSocket srvSock) {
		super();
		this.srvSock = srvSock;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		try(Scanner cosoleReader = new Scanner(System.in))
		{
			String line = "";
			while ((line = cosoleReader.nextLine())!= null)
				
			{
				if (line.equals("shutdown"))
				{
					srvSock.close();
					break;
				}
			}
		}
		
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
