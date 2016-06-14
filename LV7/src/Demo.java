import java.awt.List;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimCheck chk1 = new PrimCheck(1989990039L);
		PrimCheck chk2 = new PrimCheck(1989990047L);
		PrimCheck chk3 = new PrimCheck(3L);
		Thread a = new Thread(chk1);
		Thread b = new Thread(chk2);
		Thread c = new Thread(chk3);
		
		
		a.start();
		b.start();
		c.start();
		
		try {
			b.join();
			c.join();
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
/*	ArrayList<Long> numberList = new ArrayList<>();
	numberList.add(1989990039L);
	numberList.add(1989990047L);
	numberList.add(1991990059L);
	numberList.add(1891999939L);
	numberList.add(1891999943L);
	numberList.add(1991999993L);
	numberList.add(6L);
	

	
	
	
	for (Long long1 : numberList) {
		new Thread(new PrimCheck(long1)).start();
		
	}
		
*/		
		
	}

}
