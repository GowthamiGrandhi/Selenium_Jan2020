package filesystemsconcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuReadEx {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\f10.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		//String s = br.readLine();
		//System.out.println(s); // it will give 1st line in the given file
		
		String s;
		while((s = br.readLine()) != null)
			System.out.println(s);
		br.close();
		
	}

}
