package tm.java.basics;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		int a = sc.nextInt();
		System.out.println("Enter b value :");
		int b = sc.nextInt();
		
		int c = a + b;
		
		//System.out.println("Addition of a and b is : " + c);
		System.out.println("Addition of "+a+" and "+b+" is: "+ c);

	}

}

