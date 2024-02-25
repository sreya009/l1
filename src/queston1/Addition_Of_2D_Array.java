package queston1;

import java.util.Scanner;

public class Addition_Of_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1-------------------------------------
		Scanner reader = new Scanner(System.in);
		
		System.out.print("please enter number of row: ");
		int row = reader.nextInt();
		
		System.out.print("please enter number of column: ");
		int col = reader.nextInt();
		
		My_function myfunction = new My_function();
		
		//Matrix A
		System.out.println("please enter Matrix A:");
		int [][] Mat_A = new int[row][col];
		Mat_A = myfunction.readMatrix(row, col);
		System.out.println("Matrix A: ");
		myfunction.printMatrix(Mat_A);
		
		//Matrix B
		System.out.println("please enter Matrix B:");
		int [][] Mat_B = new int [row][col];
		Mat_B = myfunction.readMatrix(row, col);
		System.out.println("Matrix B: ");
		myfunction.printMatrix(Mat_B);
		
		//------------------------------------------
		//Step 2, 3 and 4
		System.out.println();
		System.out.println("Matrix A + Matrix B:");
		int[][] AddMatrix = myfunction.addMatrices(Mat_A, Mat_B);
		myfunction.printMatrix(AddMatrix);
		
		
		
		

	}
	
	

}
