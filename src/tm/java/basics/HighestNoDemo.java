package tm.java.basics;

import java.util.Scanner;

public class HighestNoDemo {

	public static void main(String[] args) {
		
		//int a = 900;
		//int b = 400;
		//int c = 900;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Enter c value");
		int c = sc.nextInt();	
		
		//nested if case example
		if((a>b) && (a>c))
			System.out.println("a is greater");
		else if((b>a) && (b>c))
			System.out.println("b is greater");
		else if((c>a) && (c>b))
			System.out.println("c is greater");
		else
			System.out.println("two or more values are same");

	}

}
