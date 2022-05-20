import java.io.IOException;

public class Homework {
	public static void main(String[] args)
	{
		try 
		{
		String students[] = new String[3];
		for(int i = 0; i < students.length; i++)
			students[i] = DataInput.getString("Write student: ");
		for(int i = 0; i < students.length; i++)
			System.out.println(students[i]);
		while(true)
		{
		char sym = DataInput.getChar("Write letter: ");
		for(int i = 0; i < students.length; i++)
			if(students[i].charAt(0) == sym)
				System.out.println(students[i]);
		}
		} 
		catch (IOException e) 
		{
				e.printStackTrace();
		}
	}
}
