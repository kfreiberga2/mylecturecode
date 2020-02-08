package lv.kristine.inputoutput;

import java.io.File;
import java.io.FileWriter;

public class TestCreateAndWrite {

	public static void main(String[] args) throws Exception {
		File fileObj = new File("newfile.txt");
		FileWriter fw = new FileWriter(fileObj, true);

		System.out.println("File exists");
		fw.write("vai šis strādā?");
		fw.append("\n String next line");
		fw.close();

	}

}
