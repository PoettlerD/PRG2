package org.campus02.rekrusion;

import java.io.File;

import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.xml.ws.Dispatch;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\users\\poettlerd284\\downloads");
		file.isDirectory();
		
		DisplayContent(file, " ");
		System.out.println(getSize(file));
	}

	
	public static void DisplayContent (File root, String prefix)
	{
	//	File[] files = root.listFiles();
		
		for (File f : root.listFiles()) {
			
			if (f.isDirectory())
			{
				System.out.println(prefix+"+" + f+"  " + f.length());
				DisplayContent(f, prefix+"  ");
			}
			else
			{
			System.out.println(prefix + "-" + f+"  " + f.length());
			}
		}
			
	}
		
		public static  long getSize(File f)
		{
			long size = f.length();
			if(!f.isDirectory())
			{
				return size;
			}
			
			for (File file : f.listFiles())
					{
				size = size +getSize(file);
					}
		
		return size;
		}
		
		
	
}
