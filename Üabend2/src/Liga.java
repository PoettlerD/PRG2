import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Liga {
private String Name;
private ArrayList<Team> Teams = new ArrayList<>();
public Liga(String name, ArrayList<Team> teams) {
	super();
	Name = name;
	Teams = teams;
}


public ArrayList<Team> getTeams() {
	return Teams;
}


public void setTeams(ArrayList<Team> teams) {
	Teams = teams;
}


public String getName() {
	return Name;
}


public ArrayList<Team> getTeamsByPoints()
{
	Collections.sort(Teams);

	return Teams;
}

public ArrayList<Team> getAllTeams()
{
	Collections.sort(Teams, new TeamNameComparator());
	return Teams;
}


public void add(String Name) throws TeamAlreadyExistsException
{
	for (Team team : Teams) {
		if (team.getName().equals(Name))
		{
			throw new TeamAlreadyExistsException();
		}
	}
	Teams.add(new Team(Name));
/*	if (Teams.contains(new Team(Name)))
			{
		Teams.add(new Team(Name));
			}*/

	
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Name == null) ? 0 : Name.hashCode());
	result = prime * result + ((Teams == null) ? 0 : Teams.hashCode());
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
	Liga other = (Liga) obj;
	if (Name == null) {
		if (other.Name != null)
			return false;
	} else if (!Name.equals(other.Name))
		return false;
	if (Teams == null) {
		if (other.Teams != null)
			return false;
	} else if (!Teams.equals(other.Teams))
		return false;
	return true;
}

public void newGame(String teamA,int GoalsA, String teamB, int GoalsB) throws TeamNotFoundException,LigaException
{

	
	Team a = null;
	Team b = null;
	for (Team team : Teams) {
		if (team.getName().equals(teamA)) 
		{
			  ;
		}
		if (team.getName().equals(teamB))
		{
			  b = team;
		}
		
		if (a != null || b != null)
		{
		throw new TeamNotFoundException();	
		}
				
				try {
					a.gameFinished(GoalsA, GoalsB);
					b.gameFinished(GoalsB, GoalsA);
				} catch (GoalsMustBePositiveException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			

		throw new LigaException();
	
}
}
}
