package org.campus02.io;

import java.io.IOException;

import javax.xml.stream.events.Characters;

public class bisX {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
			int byteRead;	
				while ((byteRead = System.in.read()) != -1 )
				{
					char[] c = Character.toChars(byteRead);
					System.out.println(c[0]);
					
					if(c[0]== 'x')
						break;
				}
		
	}

}
