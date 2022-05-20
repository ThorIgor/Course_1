
public class Student {
	private String name;
	private int grade;
	
	public Student()
	{
		name = "NoName";
		grade = 0;
	}
	
	public Student(String name, int grade)
	{
		setName(name);
		setGrade(grade);
	}
	
	public void setGrade(int g)
	{
		if(g < 0 || g > 100)
			return;
		grade = g;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return name + ": " + grade;
	}
}
