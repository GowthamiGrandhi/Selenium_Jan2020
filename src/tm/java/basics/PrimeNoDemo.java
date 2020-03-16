package tm.java.basics;

import java.util.Scanner;

public class PrimeNoDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = sc.nextInt(); //n is local variable to main method
		
		int cnt = 0; //cnt is local variable to main method
		for(int i=2; i<=n/2; i++){ // i is local to for loop
			if(n % i == 0){
				cnt++;
				break;
			}
		}
		if(cnt == 0)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
			
		}

	}


