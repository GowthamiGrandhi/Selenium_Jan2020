package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {


	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/f10.txt");
		//File file = new File(String path);
		FileReader fr = new FileReader(file);
		char[] a = new char[100];
		fr.read(a); // reads the content to an array
		for(char c : a) {
			System.out.print(c); // prints the characters one by one
			}
		//System.out.println("\n");
		//System.out.print(a[101]); // it will through exception
	}

	
}
