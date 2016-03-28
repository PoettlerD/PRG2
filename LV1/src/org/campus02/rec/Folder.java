package org.campus02.rec;

import java.util.ArrayList;

public class Folder extends FSEntry {

	private ArrayList<FSEntry> files = new ArrayList<>();
	private ArrayList<FSEntry> folders = new ArrayList<>();

	public Folder(String name) {
		super(name);
	}

	public void putEntry(File entry) {
		files.add(entry);
	}

	public void putEntry(Folder entry) {
		folders.add(entry);
	}

	@Override
	public void print() {
		// TODO implement the method here...

		System.out.println(getName() + " : Folder");

	}

	public void printAll() {
		// TODO implement the method here...
		for (FSEntry fsEntry : folders) {
			fsEntry.print();
		}
	for (FSEntry fsEntry : files) {
		fsEntry.print();
	}
	}

	public void listAllContent(String prefixPath) {
		// TODO implement the recursive(!) method here...
		for (FSEntry fsentry : files)
		{
			System.out.print(prefixPath);
			fsentry.print();
			
		}
		
		for (FSEntry fsEntry : folders) {
			 Folder temp = (Folder) fsEntry; //FSEntry nach folder konvertieren
			 temp.listAllContent(prefixPath+temp.getName()+"/");
		}
	
	}

	public void printTree(String indent) {
		// TODO implement the recursive(!) method here...
		System.out.println(indent+"+"+getName()+"/");
		for (FSEntry fsentry : files)
		{
			System.out.print(indent+" "+"-");
			fsentry.print();
			
		}
		for (FSEntry fsEntry : folders) {
			 Folder temp = (Folder) fsEntry; //FSEntry nach folder konvertieren
			temp.printTree(indent+"  ");
		}
	
	}

}
