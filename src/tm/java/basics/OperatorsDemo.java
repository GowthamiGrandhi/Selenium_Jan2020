package tm.java.basics;

import java.util.Scanner;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		/*int a = 10;
		int b = 20;
		System.out.println(a+b);
		
		String a = "10";
		String b = "20";
		System.out.println(a+b);
		
		String s1 = "Venky";
		String s2 = "Gowthami";
		System.out.println(s1+s2);
		
		// for two variable types + will perform concatenation not actual addition
		String s1 = "84";
		int i = 101;
		System.out.println(s1+i);
		
				int a = 100;
				int b = 200;
				int c = a+b;
				//System.out.println("Addition of a and b is : " +c);
				System.out.println("Addition of "+a+" and "+b+" is :"+c);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		//System.out.println("Addition of a and b is : " +c);
		System.out.println("Addition of "+a+" and "+b+" is :" +c);
		

	}

}
