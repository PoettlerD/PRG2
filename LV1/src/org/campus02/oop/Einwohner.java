package org.campus02.oop;

public abstract class Einwohner {
private String Bundesland;
private int einkommen;

public Einwohner(String Bundesland, int einkommen) {
	super();
	this.Bundesland = Bundesland;
	this.einkommen = einkommen;
}






public String getBundesland() {
	return Bundesland;
}

public int getEinkommen() {
	return einkommen;
}


abstract double steuer();

}
