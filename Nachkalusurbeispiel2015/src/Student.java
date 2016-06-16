
public class Student implements Comparable<Student> {

private int ID;
private String Name;
private String Jahrgang;
private String Geburtsdatum;
public Student(int iD, String name, String jahrgang, String geburtsdatum) {
	super();
	ID = iD;
	Name = name;
	Jahrgang = jahrgang;
	Geburtsdatum = geburtsdatum;
}
@Override
public String toString() {
	return "Student [ID=" + ID + ", Name=" + Name + ", Jahrgang=" + Jahrgang + ", Geburtsdatum=" + Geburtsdatum + "]";
}
public int getID() {
	return ID;
}
public String getName() {
	return Name;
}
public String getJahrgang() {
	return Jahrgang;
}
public String getGeburtsdatum() {
	return Geburtsdatum;
}

@Override
public int compareTo(Student o) {
	int order = this.Name.compareTo(o.Name);
	if (order != 0)
	{
		return order;
	}
	else
	{
		return (new Integer(this.ID).compareTo(o.ID));
	}
	
}






}
