package filesystemsconcepts;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\f10.txt");
		FileReader fr = new FileReader(file);
		int n;
		while((n = fr.read()) != -1) {
			char c = (char) n;
			System.out.print(c);
		}
		fr.close();

	}

}
