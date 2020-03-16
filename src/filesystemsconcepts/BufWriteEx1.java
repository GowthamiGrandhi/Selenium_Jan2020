package filesystemsconcepts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufWriteEx1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\f10.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Welcome to java");
		bw.close();
		
	}

}
