

public class HasenBuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lesen(4);
	}

	public static void lesen (int tiefe)
	{
		if (tiefe == 0)
		{
			System.out.println("Ein Hase...");
			return;
		}
		System.out.println("Ein Hase der gern Bücher laß");
		System.out.println("Fand ein Buch und laß;");
		
		lesen(--tiefe);
	}
	
}
