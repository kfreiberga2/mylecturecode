package lv.kristine.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReadJAva {

	
	public static void main(String[] args) throws Exception{
		File file  = new File ("Data.txt");
		FileReader fileReader =new FileReader (file);
		BufferedReader buffReader = new BufferedReader (fileReader);
		
		String stringFileData;
		while ((stringFileData = buffReader.readLine())!= null){
			System.out.println(stringFileData);
		}
		
	}

}
