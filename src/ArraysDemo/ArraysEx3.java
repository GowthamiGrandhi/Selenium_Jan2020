package ArraysDemo;

import java.util.Scanner;

public class ArraysEx3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Array size");
		int n = sc.nextInt();
		String[] names = new String[n];
		System.out.println("Enter Names: ");
		
		for(int i=0; i<names.length; i++) {
			names[i] = sc.next();
		}
		
		System.out.println("Displaying names: ");
		for(String name : names) {
			
			System.out.println(name);
		}
		
		
		
		
	}

}
