package ua.com.glybovets.lecture1;

import ua.com.glybovets.utils.DataInput;

public class MyMatrix{

	
	public static void main(String[] args){
		int [][] matrix = new int[2][2];
		System.out.println("Введемо дані в матрицю");
		inputMatrix(matrix);
		System.out.println("Виведемо матрицю");
		printMatrix(matrix);
		
	}

	private static void printMatrix(int[][] matrix) {
		for (int i=0; i<matrix.length;i++){
			for (int j = 0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void inputMatrix(int[][] matrix) {
		for (int i=0; i<matrix.length;i++){
			for (int j = 0;j<matrix[i].length;j++){
				matrix[i][j] = DataInput.getInt("Введіть елемент "+i+","+j+":");
			}
		}
	}
}
