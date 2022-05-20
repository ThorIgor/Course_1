import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		StudentsArr stdArr = new StudentsArr();
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Student ¹" + (i+1));
			String name = "NoName";
			int grade = 0;
			try {
				name = DataInput.getString("Write name: ");
				grade = DataInput.getInt("Write grade: ");
			}
			catch(IOException e){
				e.getStackTrace();
			}
			stdArr.addStudent(new Student(name, grade));
		}
		System.out.println(stdArr);
		stdArr.sortByNameUp();
		System.out.println(stdArr);
		stdArr.sortByGradeUp();
		System.out.println(stdArr);
		stdArr.sortByNameDown();
		System.out.println(stdArr);
		stdArr.sortByGradeDown();
		System.out.println(stdArr);
		

	}

}
