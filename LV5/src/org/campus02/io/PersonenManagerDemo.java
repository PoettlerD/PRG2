package org.campus02.io;

public class PersonenManagerDemo {

	public static void main(String[] args) throws PersonenManagerException {
		// TODO Auto-generated method stub
		PersonenManager test = new PersonenManager("C:\\Temp\\PersonenManager.csv");
		
		
for (PersonenManager Person : test.getPersonen()) {
	
	System.out.print(Person.getVorname());
	System.out.print(" ");
	System.out.print(Person.getNachname());
	System.out.print(" ");
	System.out.print(Person.getGeburtsort());
	
	System.out.println();
}
		
		
		
	}

}
