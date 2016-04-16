import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Liga Bundesliga = new Liga("T-Mobile Liga", new ArrayList<Team>());
		/*Team Sturm = new Team("Sturm Graz");
		Team Rapid = new Team("Rapid Wien");
		Team Austria = new Team("Austria Wien");
		Team Admira = new Team("Admira");*/
		;
		
		try {
			Bundesliga.add("Sturm Graz");
			Bundesliga.add("Admira");
			Bundesliga.add("Rapid Wien");
			Bundesliga.add("Austria Wien");
			Bundesliga.add("Sturm Graz");
		} catch (TeamAlreadyExistsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		try {
			Bundesliga.newGame("Sturm Graz", 3, "Admira", 1);
		} catch (TeamNotFoundException | LigaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			System.out.println(Bundesliga.getTeamsByPoints());
			System.out.println(Bundesliga.getAllTeams());
		
		
		
	}

}
