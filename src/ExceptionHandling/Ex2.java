package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
	
	static void readtext() throws IOException, InterruptedException {
	
		FileReader fr = null;
		Thread.sleep(2000);
		boolean bTag = false;
		
		try {
			File file = new File("D:/f10.txt");
			fr = new FileReader(file);
			char[] c = new char[100];
			fr.read(c); // Reads the content to an array
			bTag = true;
			for (int i=0; i<c.length; i++) {
				System.out.print(c[i]);
			}
		}		
		catch(FileNotFoundException e) {
			System.out.println("File not found in given path");
		}
		catch(IOException ex) {
			System.out.println("Unable to read/write content in text file");
		}
		catch(ArrayIndexOutOfBoundsException ex1) {
			System.out.println("Array out of range");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(bTag)
			fr.close();
		}
	}

	public static void main(String[] args)  {
		try {
			readtext();
		}
		catch(IOException e) {
		}
		catch(InterruptedException e) {
		}
	}

}
