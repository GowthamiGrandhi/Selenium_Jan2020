package tm.java.basics;

// import java.util.Scanner;

public class DisplayNoDemo {
	// display numbers in grid view

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value :");
		int n = sc.nextInt();
		System.out.println("Enter m value :");
		int m = sc.nextInt();
		for (int i=1; i<=n; i++){
			for (int j=1; j<=m; j++){
		
			System.out.println(i);
			System.out.println(i+ "\t"+(i+j));
			System.out.println(i+ "\t" +(i+j)+ "\t" +(i+(j+1)));
			System.out.println(i+ "\t" +(i+j)+ "\t" +(i+(j+1))+ "\t" +(i+(j+2)));
			System.out.println(i+ "\t" +(i+j)+ "\t" +(i+(j+1))+ "\t" +(i+(j+2))+ "\t" +(i+(j+3)));
		    */
		for (int i=1; i<=10; i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(j + " ");
			}
			System.out.print("\n");			
		
		}
		/*
		for ( i="*"; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(j + " ");
			}
			System.out.println("\n");
			}
			*/
		}
	}

