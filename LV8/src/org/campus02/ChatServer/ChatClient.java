package org.campus02.ChatServer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import com.sun.xml.internal.ws.resources.SenderMessages;

import javafx.scene.shape.Line;

public class ChatClient implements Runnable {
private BufferedReader reader;
private PrintWriter printwriter;
private ArrayList<ChatClient>clients = new ArrayList<>();
private Socket client;
private String name;
public static FileWriter Logfile;








public ChatClient(ArrayList<ChatClient> clients, Socket client) {
	super();
	this.clients = clients;
	this.client = client;
	this.clients.add(this);
	try {
		printwriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
		reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}


public void sendMessage(String message)
{
	printwriter.println(message);
	
	printwriter.flush();
	Log(name+": "+ message);
}

public void close()
{
	try {
	printwriter.close();
	
		reader.close();
		client.close();
		clients.remove(this);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void Log(String Message)
{
	
	try{
			Logfile.write(Message+"\n");
			Logfile.flush();
		
	} 

	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@Override
public void run() {
	// TODO Auto-generated method stub
	try{
	String line;
	
	while((line = reader.readLine()) != null)
	{
		String[] command = line.split(":");
		switch (command[0]) {
		case "<name>":
			if(command.length == 2)
			{
			name = command[1];
			}
			else
			{
				printwriter.println("Falsches Nachrichtenformat");
				printwriter.flush();
			}
			break;

		case ("<msg>"):
			if(command.length == 2)
			{
			for (ChatClient client : clients) {
				client.sendMessage(command[1]);
			}
			}
			else
			{
				printwriter.println("Falsches Nachrichtenformat");
				printwriter.flush();
			}
			break;
		case ("<msgto>"):
			if(command.length == 3)
			{
		for(ChatClient client : clients)
		{
			if(client.name.equals(command[1]))
			{
				client.sendMessage(command[2]);
			}
		}
			}
			else
			{
				printwriter.println("Falsches Nachrichtenformat");
				printwriter.flush();
			}
		break;
		case ("<bye>"):
			close();
			break;
		
		default:
			printwriter.println("Falsches Nachrichtenformat");
			printwriter.flush();
			break;
		}
	}
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
	
}





}
