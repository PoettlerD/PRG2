import java.util.Comparator;

public class StudentComperator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int sort = o2.getGeburtsdatum().compareTo(o1.getGeburtsdatum());
		if (sort != 0)
		{
			return sort;
		}
		else
		{
			return (o1.getName().compareTo(o2.getName()));
		}
		
	}

}
