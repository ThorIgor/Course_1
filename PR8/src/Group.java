
public class Group {
	private int ID;
	private Student students[];
	
	public Group(int id) { 
		ID = id;
		students = new Student[0];
	}
	
	public void addStudent(Student st)
	{
		Student newStd[] = new Student[students.length+1];
		for(int i = 0; i < students.length; i++)
			newStd[i] = students[i];
		newStd[students.length] = st;
		students = newStd;
	}
	
	public Student[] getMaxStudent()
	{
		int max = -1;
		Student std[] = new Student[0];
		for(Student st:students)
		{
			if(st.getGrade() > max)
			{
				max = st.getGrade();
				std = new Student[0];
				std = addStudent(std, st);
			}
			else if(st.getGrade() == max)
				std = addStudent(std, st);
		}
		return std;
	}
	
	private Student[] addStudent(Student[] std, Student st)
	{
		Student newStd[] = new Student[std.length+1];
		for(int i = 0; i < std.length; i++)
			newStd[i] = std[i];
		newStd[std.length] = st;
		return newStd;
	}
	
	public Student[] getMinStudent()
	{
		int min = 101;
		Student std[] = new Student[0];
		for(Student st:students)
		{
			if(st.getGrade() < min)
			{
				min = st.getGrade();
				std = new Student[0];
				std = addStudent(std, st);
			}
			else if(st.getGrade() == min)
				std = addStudent(std, st);
		}
		return std;
	}
	
	public String toString() {
		String str = "Group " + ID + ":";
		for(Student st:students)
			str+="\n"+st;
		return str;
	}
}
