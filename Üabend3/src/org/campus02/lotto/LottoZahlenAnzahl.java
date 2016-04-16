package org.campus02.lotto;

public class LottoZahlenAnzahl implements Comparable<LottoZahlenAnzahl> { 
public int zahl;
public int counter;

public LottoZahlenAnzahl(int zahl) {
	super();
	this.zahl = zahl;
	this.counter = 1;
}

public void increment()
{
	this.counter++;
}



public int getZahl() {
	return zahl;
}

public void setZahl(int zahl) {
	this.zahl = zahl;
}

public int getCounter() {
	return counter;
}

public void setCounter(int counter) {
	this.counter = counter;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + counter;
	result = prime * result + zahl;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	LottoZahlenAnzahl other = (LottoZahlenAnzahl) obj;
	if (counter != other.counter)
		return false;
	if (zahl != other.zahl)
		return false;
	return true;
}

@Override
public int compareTo(LottoZahlenAnzahl arg0) {
	// TODO Auto-generated method stub
	if (this.counter < arg0.counter)
		return -1;
	if (this.counter > arg0.counter)
		return 1;
	return 0;
}



	
	
	
	
	
}
