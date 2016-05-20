package org.campus02.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class AdressManager {
private ArrayList<Adress> adressList = new ArrayList<>();





	public AdressManager(ArrayList<Adress> adressList) {
	super();
	this.adressList = adressList;
}


	public ArrayList<Adress> getAdressList() {
	return adressList;
}


	public void add(Adress a)
	{
		adressList.add(a);
	}


	public void exportToCsv(String path, String separator ) throws AddressExportException
	{
	File f = new File(path);
	try(
	//BufferedWriter bw = new BufferedWriter(new PrintWriter(new FileWriter(f,true)));
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
	) 
	{
	for (Adress adress : adressList) {
		//Alternativ mit PrintReader
	pw.println(adress.getFirstane()+separator+adress.getLastname()+separator+adress.getMobilNumber()+separator+adress.getEmail()+separator);
	pw.flush();
	}
	
	

	
	}
	catch (IOException e) {
		throw new AddressExportException(e);
		
	}
	
}

	public void loadFromCsv(String path, String separator ) throws AdressLoadException,AddrressLoadWrongException
	{
		File f = new File(path);
		try(
				BufferedReader br = new BufferedReader(new FileReader(f));
		){
			int counter = 1;
			String data = "";
			while ((data = br.readLine()) != null)
			{
				String[] dataArr = data.split(separator);
				if (dataArr.length != 4)
				{
					throw new AddrressLoadWrongException("Fehler in Zeile "+counter);
				}
				add(new Adress(dataArr[0], dataArr[1], dataArr[2], dataArr[3]));
				counter++;
		}
		}
		catch(FileNotFoundException e){
			throw new AdressLoadException (e);
		}
		catch (IOException e) {
			// TODO: handle exception
			throw new AdressLoadException (e);
		}
		}
	}

