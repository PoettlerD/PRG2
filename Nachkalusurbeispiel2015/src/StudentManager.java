import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentManager {
private File Textfile;
private ArrayList<Student> students = new ArrayList<>();

public StudentManager(File textfile) {
	super();
	Textfile = textfile;
}
	
public ArrayList<Student> getStudents() {
	return students;
}

public void load (String Jahrgang) throws DataFileException
{
	try (BufferedReader br = new BufferedReader(new FileReader(Textfile));)
	{

		String line;
		while((line = br.readLine()) != null )
		{
			String[] split = line.split(",");
			if (split[2].equals(Jahrgang))
			{
				int id = Integer.parseInt(split[0]);
				students.add(new Student(id, split[1], split[2], split[3]));
				}
		}
		students.sort(new StudentComperator());
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		throw new DataFileException(e);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		throw new DataFileException(e);
	}
}

}
