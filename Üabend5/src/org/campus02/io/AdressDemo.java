package org.campus02.io;

import java.util.ArrayList;

public class AdressDemo {

	public static void main(String[] args) throws AddressExportException,AdressLoadException,AddrressLoadWrongException {
		// TODO Auto-generated method stub

		Adress adr1 = new Adress("Max", "Musterman", "123456789", "Max.Mustermann@Muster.at");
		Adress adr2 = new Adress("Martina", "Musterfrau", "223456789", "Martina.Musterfrau@Muster.at");
	
	
	AdressManager ads = new AdressManager(new ArrayList<>());
	ads.add(adr1);
	ads.add(adr2);
	
	ads.exportToCsv("C:\\Temp\\testliste.csv", ",");
	
	
	AdressManager ads2 = new AdressManager(new ArrayList<>());
	
	ads2.loadFromCsv("C:\\temp\\testliste.csv", ",");
	
	for (Adress adr : ads2.getAdressList()) {
	
		System.out.println(adr.toString());
	}
	
	}

}
