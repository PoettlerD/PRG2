package org.campus02.oop;

public class Landwirt extends Einwohner {

	public Landwirt(int flaeche,String Bundesland) {
		super(Bundesland, flaeche*100);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	double steuer() {
		// TODO Auto-generated method stub
	
		return getEinkommen()*0.225;
	}

	
}
