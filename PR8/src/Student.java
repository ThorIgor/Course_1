import java.io.IOException;

public class Student {
	private String name;
	private int course;
	private int grade;
	
	private Student(String n, int g, int c) {name = n; grade = g; course = c;}
	
	public static Student createStudent()
	{
		try
		{
			String name = DataInput.getString("PIB: ");
			int grade = DataInput.getInt("Grade: ");
			int course = DataInput.getInt("Course: ");
			if(course < 1 || course > 4)
				course = 1;
			if(grade >= 0 && grade <= 100)
				return new Student(name, grade, course);
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		System.out.println("Error");
		return null;
	}
	
	public int getGrade() {return grade;}
	
	public String toString() {return name + "(" + course + "): " + grade;}
}
