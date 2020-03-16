package tm.java.basics;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// knowing given number is even no. or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		if(n % 2 == 0)
			System.out.println(n +" is even Number");
		else
			System.out.println(n +" is odd Number");
		

	}

}
