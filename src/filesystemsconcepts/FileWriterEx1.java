package filesystemsconcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\f10.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("it's a family");
		fw.close();
		
	}

}
