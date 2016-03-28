package org.campus02.oop;

import java.util.ArrayList;

public class Bundesstaat {
private ArrayList<Einwohner> einwohner = new ArrayList<>();

public void add(Einwohner temp)
{
	einwohner.add(temp);
}

public double gesamtSteuer()
{
	double steuerGesamt = 0;
	for (Einwohner einwohner2 : einwohner) {
		steuerGesamt=einwohner2.steuer();
	}
	return steuerGesamt;

}


}
