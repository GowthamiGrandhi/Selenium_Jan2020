package tm.java.basics;

import java.util.Scanner;

public class TableEX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++){
			String s = n+" * "+i+" = "+(n*i);
			System.out.println(s);
			
		}



	}

}
