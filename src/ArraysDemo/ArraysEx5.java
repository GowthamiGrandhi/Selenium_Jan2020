package ArraysDemo;

import java.util.Scanner;

public class ArraysEx5 {

	public static void main(String[] args) {
		
		String[][] matrix = new String [2][2];
		//System.out.println("Enter Names: ");
		
		for(int i=0; i<matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++){
				
			System.out.print(matrix[i][j] + " ");
		}
		
			
		System.out.println("Displaying names: ");
		for(Object[] name : matrix) 
			
			System.out.println(name);
		}
		
	
}
	
}
