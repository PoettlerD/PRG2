package org.campus02.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.omg.PortableServer.ThreadPolicyOperations;

import com.sun.xml.internal.fastinfoset.tools.VocabularyGenerator;

public class PersonenManager  {
private String Vorname;
private String Nachname;
private String Geburtsort;
private ArrayList<PersonenManager> Personen = new ArrayList<>();







public String getVorname() {
	return Vorname;
}







public String getNachname() {
	return Nachname;
}







public String getGeburtsort() {
	return Geburtsort;
}








public void load(String Path) throws PersonenManagerException
{
	File f = new File(Path);
	try 
	(BufferedReader br = new BufferedReader(new FileReader(f))
	)
	{
		String Data;
		while ((Data = br.readLine()) != null)
		{
			String[] dataArr = Data.split(",");
			Vorname = dataArr[0];
			Nachname = dataArr[1];
			Geburtsort = dataArr[2];
			Personen.add(new PersonenManager(Vorname, Nachname, Geburtsort));
		}
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
		throw new PersonenManagerException(e);
	}
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}







private PersonenManager(String vorname, String nachname, String geburtsort) {
	super();
	Vorname = vorname;
	Nachname = nachname;
	Geburtsort = geburtsort;
}







public PersonenManager(String path) throws PersonenManagerException {
	// TODO Auto-generated constructor stub
	load(path);
}







public ArrayList<PersonenManager> getPersonen() {
	return Personen;
}
}
