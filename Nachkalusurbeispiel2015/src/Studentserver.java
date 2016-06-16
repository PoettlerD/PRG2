import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.sun.management.jmx.Trace;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Studentserver {

	public static File studentFile = new File("C:\\Temp\\Students.csv");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		try (ServerSocket srvSock = new ServerSocket(1234);)
		{
			Thread slist = new Thread(new ConsoleListener(srvSock));
			slist.start();
		while (true)
		{
			
			Socket clientSock = srvSock.accept();
			
			Thread th1 = new Thread(new Worker(clientSock));
			th1.start();
			
			/*BufferedReader br = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSock.getOutputStream()));
			
			String line;
			while ((line = br.readLine()) != null)
			{
				String[] split = line.split(" ");
				
				if (split[0].equalsIgnoreCase("Get"))
						{
					if (split.length == 2)
					{
						StudentManager studentsByJahrgang = new StudentManager(studentFile);
						studentsByJahrgang.load(split[1]);
						for (Student s : studentsByJahrgang.getStudents()) {
							bw.write(s.toString());
							bw.newLine();
							bw.write("Procceed");
							bw.flush();
						}
						
					}
					if (split.length == 5)
					{
						if (split[0].equals("Get")&&split[2].equals("order")&&split[3].equals("by")&&split[4].equals("name"))
						{
						StudentManager studentsByJahrgang = new StudentManager(studentFile);
						studentsByJahrgang.load(split[1]);
						ArrayList<Student> st = studentsByJahrgang.getStudents();
						java.util.Collections.sort(st);
						for (Student s : st) {
							bw.write(s.toString());
							bw.newLine();
							bw.flush();
						}
						}
						else
						{
							bw.write("Ungültiges Eingabeformat");
							bw.newLine();
							bw.flush();
						}
						}
			}
			
		}*/
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
