package tm.java.basics;

import java.util.Scanner;

public class ReverseNoDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
				int r;
				int rev = 0;
		while(n!=0) {
			r = n % 10; 
			rev = rev * 10 + r;
			n= n/10;
			}
		System.out.println("rev of given number is: " + rev);
	
		}
	}


