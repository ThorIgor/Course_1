package ua.com.glybovets.lecture2;

import ua.com.glybovets.utils.*;

public class ArraySort{

	
	public static void main(String[] args){
		ArraySort as = new ArraySort();
		as.inputArray();
		as.printArray();
		//insertionSort();
		//selectionSort();
		as.bubbleSort();
		as.printArray();
	}
	
	// Сортуванння вставкою
	private void insertionSort() {
		for (int i=1;i<mas.length;i++){
			int b = mas[i];
			int j = 0;
			while (b>mas[j]){
				j++;
			}
			for (int k=i;k>j;k--)
				mas[k]=mas[k-1];
			mas[j]=b;
		}
		
	}
	
	//сортування вибором
	private void selectionSort() {
		for (int i=0;i<mas.length-1;i++){
			int min = mas[i];
			int imin = i;
			for (int j=i+1;j<mas.length;j++){
				if (mas[j]<min){
					min = mas[j];
					imin = j;
				}
			}
			mas[imin]=mas[i];
			mas[i]=min;
		}
	}

	//бульбашкове сортування
	private void bubbleSort(){
		for (int i = mas.length-1;i>0;i--){
			for (int j=0;j<i;j++){
				if (mas[j]>mas[j+1]){
					int t = mas[j];
					mas[j]=mas[j+1];
					mas[j+1]=t;
				}
			}
		}
	}
	
	private void printArray() {
		System.out.println("Матриця");
		for (int i=0; i<mas.length;i++){
				System.out.print(mas[i]+" ");
			}
		System.out.println();
	}

	private void inputArray() {
		int dim = DataInput.getInt("Введіть розмірність масиву: ");
		mas = new int[dim];
		for (int i=0; i<mas.length;i++){
			mas[i] = DataInput.getInt("Введіть "+(i+1)+"-й елемент: ");
		}
	}
	
	private int[] mas;
	
}
