package ua.com.glybovets.lecture1;

import ua.com.glybovets.utils.*;

public class EffectiveArray2{
	
	private static final int SENTINEL = -1;
	
	public static void main(String[] args){
		
		int maxLength = DataInput.getInt("Введіть максимальну кількість студентів в групі: ");
		int[] midtermScores = new int[maxLength];
		//кількість записаних оцінок студентів
		int numActualScores = 0;
		
		for (int i =0; i<maxLength; i++){
			midtermScores[i] = DataInput.getInt("Введіть оцінку "+(i+1)+"-го студента (-1 означає кінець введення): ");
			if (midtermScores[i] == SENTINEL) break;
			numActualScores++;
		}
		
		System.out.println("Середній бал в групі: "+computeAverage(midtermScores, numActualScores));
	}

	private static double computeAverage(int[] midtermScores, int numActualScores) {
		double sum=0;
		for (int i=0;i<numActualScores; i++){
			sum+=midtermScores[i];
		}
		
		return sum/numActualScores;
	}

}
