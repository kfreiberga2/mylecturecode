package lv.kristine.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestChangeString {

	
	public static void main(String[] args) throws Exception{
		
		File file = new File("DefaultText.txt");
		Scanner sc = new Scanner(file);
		String stringFromTextFile= "";

		while (sc.hasNextLine()){
			stringFromTextFile = sc.nextLine();
			
		}
		
		String lastString  = stringFromTextFile.replace("userName", "");
		String userName = "Kristine Freiberga";
		File fileForUser = new File (userName+ ".txt");
		File fileObj = new File("newfile.txt");
		FileWriter fw = new FileWriter(fileForUser, true);
		//System.out.println("File exists");
		fw.write(lastString+userName);
		fw.close();
	}

}
