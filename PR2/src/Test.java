

public class Test {
	public static void main(String[] args)
	{
		StudentsGrades stdGrades = new StudentsGrades();
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++)
			stdGrades.addGrade((int)DataInput.getInt("Grade of student " + (i+1) + ": "));
		System.out.print(stdGrades + "\n");
		stdGrades.sortUp();
		System.out.print(stdGrades + "\n");
		stdGrades.sortDown();
		System.out.print(stdGrades + "\n");
		System.out.print("Avg grade: " + stdGrades.getAvgGrade() + "\n");
		System.out.print("Max grade: " + stdGrades.getMaxGrade() + "\n");
		System.out.print("Min grade: " + stdGrades.getMinGrade() + "\n");
		System.out.print("NumOfStdMoreThenAvg: " + stdGrades.getNumOfStdMoreThenAvg() + "\n");
		System.out.print("NumOfStdLessThenAvg: " + stdGrades.getNumOfStdLessThenAvg() + "\n");
		System.out.print("NumOfStdWithExcellentGrade: " + stdGrades.getNumOfStdWithExcellentGrade() + "\n");
		System.out.print("NumOfStdWithGoodGrade: " + stdGrades.getNumOfStdWithGoodGrade() + "\n");
		System.out.print("NumOfStdWithSatisfactoryGrade: " + stdGrades.getNumOfStdWithSatisfactoryGrade() + "\n");
		System.out.print("NumOfStdWithNotSatisfactoryGrade: " + stdGrades.getNumOfStdWithNotSatisfactoryGrade() + "\n");
	}
}
