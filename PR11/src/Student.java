import java.io.IOException;

public class Student {
	private String PIB;
	private int grade;
	private int course;
	
	public Student(String pib, int gr, int c)
	{
		setPIB(pib);
		setGrade(gr);
		setCourse(c);
	}
	
	public static Student getStudent() throws IOException
	{
		String pib = DataInput.getString("PIB: ");
		int grade = -1;
		do {
			try {
			grade = DataInput.getInt("Grade: ");
			if(grade < 0 || grade > 100)
				System.out.println("Error");
			}catch(IOException e) {
				System.out.println("Error");
			}
		}while(grade < 0 || grade > 100);
		int course = 0;
		do
		{
			try {
			course = DataInput.getInt("Course: ");
			if(course < 1 || course > 4)
				System.out.println("Error");
			}catch(IOException e) {
				System.out.println("Error");
			}
		}while(course < 1 || course > 4);
		return new Student(pib, grade, course);
	}
	
	public void setPIB(String pib) {PIB = pib;}
	public void setGrade(int gr) {grade = gr;}
	public void setCourse(int c) {course = c;}
	
	public String getPIB() {return PIB;}
	public int getGrade() {return grade;}
	public int getCourse() {return course;}
	
	public String toString() {
		return PIB + "(" + course + "): " + grade; 
	}
}
