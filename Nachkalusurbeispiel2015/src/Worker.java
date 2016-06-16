import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class Worker implements Runnable {
private Socket Clientsocket;


	public Worker(Socket clientsocket) {
	super();
	Clientsocket = clientsocket;
}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		try(
		BufferedReader br = new BufferedReader(new InputStreamReader(Clientsocket.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(Clientsocket.getOutputStream()));
		)
		{
		String line = "";
		bw.write("Connection Accepted");
		bw.newLine();
		bw.flush();
		
		while ((line = br.readLine()) != null)
		{
			String[] split = line.split(" ");
			
			if (split[0].equals("Get"))
					{
				if (split.length == 1 && split[0].equals("close"))
				{
					Clientsocket.close();
				}
				if (split.length == 2)
				{
					StudentManager studentsByJahrgang = new StudentManager(Studentserver.studentFile);
					studentsByJahrgang.load(split[1]);
					for (Student s : studentsByJahrgang.getStudents()) {
						bw.write(s.toString());
						bw.newLine();
						bw.flush();
					}
					
				}
				if (split.length == 5)
				{
					if (split[0].equals("Get")&&split[2].equals("order")&&split[3].equals("by")&&split[4].equals("name"))
					{
					StudentManager studentsByJahrgang = new StudentManager(Studentserver.studentFile);
					studentsByJahrgang.load(split[1]);
					ArrayList<Student> st = studentsByJahrgang.getStudents();
					java.util.Collections.sort(st);
					for (Student s : st) {
						bw.write(s.toString());
						bw.newLine();
						bw.flush();
					}
				}
					else{
						bw.write("Ungültiges Eingabeformat");
						bw.newLine();
						bw.flush();
					}
					}
		}
		}
	
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (DataFileException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
	}
	

}
