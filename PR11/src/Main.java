import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		boolean end = false;
		while(!end)
		{
			try
			{
				System.out.println("Group");
				System.out.println("1.Add student");
				System.out.println("2.Print group");
				System.out.println("3.Sort group by name");
				System.out.println("4.Sort group by grade");
				System.out.println("5.Sort group by course");
				System.out.println("6.Exit");
				int menu = DataInput.getInt("Write: ");
				
				switch(menu)
				{
				case 1:
					students.add(Student.getStudent());
					break;
				case 2:
					for(Student st:students)
						System.out.println(st);
					break;
				case 3:
					students.sort(new Comparator<Student>() {
						@Override
						public int compare(Student o1, Student o2) {
							return o1.getPIB().compareToIgnoreCase(o2.getPIB());
						}
						
					});
					break;
				case 4:
					students.sort(new Comparator<Student>() {

						@Override
						public int compare(Student o1, Student o2) {
							if(o1.getGrade() > o2.getGrade())
								return 1;
							else if(o1.getGrade() == o2.getGrade())
								return 0;
							else
								return -1;
						}
					});
					break;
				case 5:
					students.sort(new Comparator<Student>() {

						@Override
						public int compare(Student o1, Student o2) {
							if(o1.getCourse() > o2.getCourse())
								return 1;
							else if(o1.getCourse() == o2.getCourse())
								return 0;
							else
								return -1;
						}
					});
					break;
				case 6:
					end = true;
					break;
				default:
					System.out.print("Error");
				}
				
			}catch(IOException ex){
				System.out.println("Error");
			}
		}
	}

}
