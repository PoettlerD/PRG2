package org.campus02.Textanalyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.classfile.Field;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		File text = new File("C:\\temp\\text.txt");
		TextReader tr = new TextReader(text);
		tr.Textanalyze();
		
		TextAnalyzer ta1 = new TextAnalyzer(tr.getEven());
		TextAnalyzer ta2 = new TextAnalyzer(tr.getOdd());
		
		Thread tr1 = new Thread(ta1);
		Thread tr2 = new Thread(ta2);
		
		
	}

	
	

}
