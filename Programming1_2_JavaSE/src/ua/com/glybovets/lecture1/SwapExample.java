package ua.com.glybovets.lecture1;

public class SwapExample{
	
	public static void main(String[] args){
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		
		System.out.println("Обміняємо елементи місцями");
		swapElementsBuggy(array[0],array[1]);
		System.out.println("array[0] = "+array[0]);
		System.out.println("array[1] = "+array[1]);
		System.out.println("Обміняємо елементи іншим способом");
		swapElementsHappy(array,0,1);
		System.out.println("array[0] = "+array[0]);
		System.out.println("array[1] = "+array[1]);
	}

	private static void swapElementsHappy(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}

	private static void swapElementsBuggy(int i, int j) {
		int temp = i;
		j=i;
		i = temp;
		
	}

}
