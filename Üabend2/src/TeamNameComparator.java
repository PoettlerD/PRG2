import java.util.Comparator;

public class TeamNameComparator implements Comparator<Team> {

	@Override
	public int compare(Team arg0, Team arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
		
	}

}
