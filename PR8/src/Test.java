import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		while(true)
		{
			int id = DataInput.getInt("ID: ");
			Group group = new Group(id);
			int count = DataInput.getInt("Number of students: ");
			for(int i = 0; i < count; i++)
			{
				Student std = Student.createStudent();
				if(std == null)
				{
					System.out.println("Try again");
					i--;
					continue;
				}
				else
					group.addStudent(std);
			}
			System.out.println(group);
			System.out.println("Student with max grade: ");
			for(Student st:group.getMaxStudent())
				System.out.println("	"+st);
			System.out.println("Student with min grade: ");
			for(Student st:group.getMinStudent())
				System.out.println("	"+st);
		}
	}
}
