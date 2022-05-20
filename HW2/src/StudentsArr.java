
public class StudentsArr {
	private Student students[];
	
	public StudentsArr(Student std[])
	{
		students = std;
	}
	
	public StudentsArr()
	{
		students = new Student[0];
	}
	
	public void setStudents(Student std[])
	{
		students = std;
	}
	public Student[] getStudents()
	{
		return students;
	}
	
	public void addStudent(Student std)
	{
		Student newS[] = new Student[students.length+1];
		for(int i = 0; i < students.length; i++)
			newS[i] = students[i];
		newS[students.length] = std;
		students = newS;
	}
	
	public void sortByNameUp()
	{
		for(int i = 0; i < students.length; i++)
		{
			for(int j = i; j < students.length; j++)
			{
				for(int k = 0; k < Math.max(students[i].getName().length(), students[j].getName().length()); k++)
				{
					if(students[i].getName().charAt(k) == students[j].getName().charAt(k))
						continue;
					if(students[i].getName().charAt(k) > students[j].getName().charAt(k))
					{
						swap(i, j);
						break;
					}
					else
						break;
				}
			}
		}
					
	}
	
	public void sortByNameDown()
	{
		for(int i = 0; i < students.length; i++)
		{
			for(int j = i; j < students.length; j++)
			{
				for(int k = 0; k < Math.max(students[i].getName().length(), students[j].getName().length()); k++)
				{
					if(students[i].getName().charAt(k) == students[j].getName().charAt(k))
						continue;
					if(students[i].getName().charAt(k) < students[j].getName().charAt(k))
					{
						swap(i, j);
						break;
					}
					else
						break;
				}
			}
		}
					
	}
	
	public void sortByGradeUp()
	{
		for(int i = 0; i < students.length; i++)
			for(int j = i; j < students.length; j++)
				if(students[i].getGrade() < students[j].getGrade())
					swap(i, j);
	}
	
	public void sortByGradeDown()
	{
		for(int i = 0; i < students.length; i++)
			for(int j = i; j < students.length; j++)
				if(students[i].getGrade() > students[j].getGrade())
					swap(i, j);
	}
	
	public String toString()
	{
		String str = "Studets:";
		for(int i = 0; i < students.length; i++)
			str += "\n" + students[i];
		return str;
	}
	
	private void swap(int i, int j)
	{
		Student pr = students[i];
		students[i] = students[j];
		students[j] = pr;
	}
}
