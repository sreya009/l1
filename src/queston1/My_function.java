package queston1;

import java.util.Scanner;

public class My_function {
	
	//--------------------------------------------------
	public static int [][] readMatrix(int rows,int cols)
	{
		Scanner reader = new Scanner(System.in);
		int [][] myMatrix = new int[rows][cols];
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				myMatrix[i][j]=reader.nextInt();
			}
		}
		return myMatrix;
		
	}
	//---------------------------------------------------
	public static void printMatrix(int [][] myMatrix) 
	{
		int rows = myMatrix.length;
		int cols = myMatrix[0].length;
		for (int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				System.out.print(myMatrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	//----------------------------------------------------
	
	public static int[][] addMatrices(int[][] Mat_a,int [][] Mat_b)
	{
		int rows = Mat_a.length;
		int cols = Mat_a[0].length;
		int [][] myMatrix = new int [rows][cols];
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<cols;j++) 
			{
				myMatrix[i][j] = Mat_a[i][j]+Mat_b[i][j];
			}
		}
		return myMatrix;
	}
	//-------------------------------------------------------

}
