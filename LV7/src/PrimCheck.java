import java.lang.Math;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class PrimCheck implements Runnable {
private boolean isPrim;
private long Number;

public PrimCheck (long Number)
{
	this.Number = Number;
}



	public boolean isPrim() {
	return isPrim;
}



public long getNumber() {
	return Number;
}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		isPrim = true; 
		for(int i=2;2*i<Number;i++) {
	        if(Number%i==0)
	            isPrim = false;
	    }
	    	
	    
	    
	    System.out.println(Number+" ist Primzahl: "+isPrim);
	}
	
	

}
