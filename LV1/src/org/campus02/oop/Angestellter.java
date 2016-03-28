package org.campus02.oop;

import javax.swing.SwingConstants;

public class Angestellter extends Einwohner {
private int kinder;
	public Angestellter(String Bundesland, int einkommen, int kinder) {
		super(Bundesland, einkommen);
		// TODO Auto-generated constructor stub
		this.kinder = kinder;
		System.out.println("Hallo");
	}

	public int getKinder() {
		return kinder;
	}
	@Override
	public double steuer() {
		// TODO Auto-generated method stub
		double Steuer;
		switch (getKinder()) {
		case 0:
			Steuer = getEinkommen()*0.5;
			break;

		case 1:
			Steuer = getEinkommen()*0.4;
			break;
		case 2:
			Steuer = getEinkommen()*0.3;
			break;
		case 3:
			Steuer = getEinkommen()*0.15;
			break;
		default:
			Steuer = getEinkommen() * 0.05;
			break;
		}
		return Steuer;
	}

}
