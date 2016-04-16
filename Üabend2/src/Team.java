public class Team implements Comparable<Team> {
private String Name;
private int CountWon;
private int CountDraw;
private int CountLost;
private int GoalsScored;
private int GoalsGot;
private int Points;
private int PlayeRounds;

public Team(String name) {
	super();
	Name = name;
	CountWon = 0;
	CountDraw = 0;
	CountLost = 0;
	GoalsScored = 0;
	GoalsGot = 0;
	Points = 0;
	PlayeRounds = 0;
}

public int getCountWon() {
	return CountWon;
}

public void setCountWon(int countWon) {
	CountWon = countWon;
}

public int getCountDraw() {
	return CountDraw;
}

public void setCountDraw(int countDraw) {
	CountDraw = countDraw;
}

public int getCountLost() {
	return CountLost;
}

public void setCountLost(int countLost) {
	CountLost = countLost;
}

public int getGoalsScored() {
	return GoalsScored;
}

public void setGoalsScored(int goalsScored) {
	GoalsScored = goalsScored;
}

public int getGoalsGot() {
	return GoalsGot;
}

public void setGoalsGot(int goalsGot) {
	GoalsGot = goalsGot;
}

public int getPoints() {
	return Points;
}

public void setPoints(int points) {
	Points = points;
}

public int getPlayeRounds() {
	return PlayeRounds;
}

public void setPlayeRounds(int playeRounds) {
	PlayeRounds = playeRounds;
}

public String getName() {
	return Name;
}

@Override
public String toString() {
	return "Team [Name=" + Name + ", CountWon=" + CountWon + ", CountDraw=" + CountDraw + ", CountLost=" + CountLost
			+ ", GoalsScored=" + GoalsScored + ", GoalsGot=" + GoalsGot + ", Points=" + Points + ", PlayeRounds="
			+ PlayeRounds + "]";
}

@Override
public int compareTo(Team o) {
	// TODO Auto-generated method stub
	if (this.getPoints() < o.getPoints())
	{
		return 1;
	}
	if (this.getPoints() > o.getPoints())
	{
		return -1;
	}
	
	if ((this.getPoints() == o.getPoints())&& (this.getGoalsScored()-this.getGoalsGot() < o.getGoalsScored()- o.getGoalsGot()))
	{
		return 1;
	}
	if ((this.getPoints() == o.getPoints())&& (this.getGoalsScored()-this.getGoalsGot() > o.getGoalsScored()- o.getGoalsGot()))
	{
		return -1;
	}
	return 0;
}

public void gameFinished(int goalsScored,int goalsGot) throws GoalsMustBePositiveException
{
	try{
		if (goalsGot < 0 || goalsScored < 0)
		{
			throw new GoalsMustBePositiveException();
		}
	this.setGoalsGot(getGoalsGot()+goalsGot);
		this.setGoalsScored(getGoalsScored()+goalsScored);
		if (goalsGot < goalsScored)
		{
			this.setCountWon(this.getCountWon()+1);
		this.Points +=3;
		}
		else
		{
			this.setCountLost(this.getCountLost()+1);
			this.Points +=0;
		}
		if (goalsGot == goalsScored)
		{
			this.setCountDraw(this.getCountDraw()+1);
			this.Points +=1;
		}
	}
	catch (GoalsMustBePositiveException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}




}
