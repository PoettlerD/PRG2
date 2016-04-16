public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int test = Summ(3, 5);
		
		System.out.println(test);
		System.out.println(Multi(4, 5));
	}
	
	
	public static int Summ(int a, int b)
	{
		if (b == 0)
			return a;
		return Summ(a+1,b-1);
		
	}
	
	public static int Multi(int x, int y)
	{
		if (y == 1)
		return x;
		
		return Summ(x, Multi(x, y-1));
	}

}
