

public class StudentsGrades {
	private int grades[];
	private int students;
	
	public StudentsGrades()
	{
		students = 0;
		grades = new int[students];
	}
	
	public StudentsGrades(int std)
	{
		students = std;
		grades = new int[students];
	}
	
	public StudentsGrades(int[]grd)
	{
		students = grd.length;
		grades = grd;
	}
	
	public int[] getGrades()
	{
		return grades;
	}
	
	public void setGrades(int[] newG)
	{
		if(newG.length > students)
			return;
		for(int i = 0; i < newG.length; i++)
			if(newG[i] > 100 || newG[i] < 0)
				return;
		grades = newG;
	}
	
	public void addGrade(int grade)
	{
		int[] newGrades = new int[++students];
		for(int i = 0; i < grades.length; i++)
			newGrades[i] = grades[i];
		newGrades[students-1] = grade;
		grades = newGrades;
	}
	
	public int getMaxGrade()
	{
		int max = 0;
		for(int i = 0; i < students; i++)
			if(grades[i] > max)
				max = grades[i];
		return max;
	}
	
	public int getMinGrade()
	{
		int min = 100;
		for(int i = 0; i < students; i++)
			if(grades[i] < min)
				min = grades[i];
		return min;
	}
	
	public int getAvgGrade()
	{
		int sum = 0;
		for(int i = 0; i < students; i++)
			sum+=grades[i];
		return sum/students;
	}
	
	public int getNumOfStdMoreThenAvg()
	{
		int num = 0;
		for(int i = 0; i < students; i++)
			if(grades[i] > getAvgGrade())
				num++;
		return num;
	}
	
	public int getNumOfStdLessThenAvg()
	{
		int num = 0;
		for(int i = 0; i < students; i++)
			if(grades[i] < getAvgGrade())
				num++;
		return num;
	}
	
	public int getNumOfStdWithExcellentGrade()
	{
		int num = 0;
		for(int i = 0; i < students; i++)
			if(grades[i] > 90)
				num++;
		return num;
	}
	
	public int getNumOfStdWithGoodGrade()
	{
		int num = 0;
		for(int i = 0; i < students; i++)
			if(grades[i] > 70 && grades[i] < 91)
				num++;
		return num;
	}
	
	public int getNumOfStdWithSatisfactoryGrade()
	{
		int num = 0;
		for(int i = 0; i < students; i++)
			if(grades[i] >= 60 && grades[i] < 71)
				num++;
		return num;
	}
	
	public int getNumOfStdWithNotSatisfactoryGrade()
	{
		int num = 0;
		for(int i = 0; i < students; i++)
			if(grades[i] >= 0 && grades[i] < 60)
				num++;
		return num;
	}
	
	public String toString()
	{
		String str = "Grades: ";
		for(int i = 0; i < students; i++)
			str+= grades[i] + " ";
		return str;
	}
	
	public void sortUp()
	{
		for(int i = 0; i < students; i++)
			for(int j = 0; j < students; j++)
				if(grades[i] < grades[j])
					swap(i, j);
	}
	
	public void sortDown()
	{
		for(int i = 0; i < students; i++)
			for(int j = 0; j < students; j++)
				if(grades[i] > grades[j])
					swap(i, j);
	}
	
	private void swap(int i, int j)
	{
		int pr = grades[i];
		grades[i] = grades[j];
		grades[j] = pr;
	}
}
