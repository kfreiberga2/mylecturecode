package lv.kristine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateJava {

	
	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		
		System.out.println("Time in machine: "+myDateObj);
		
		
		DateTimeFormatter myFormatObjTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formatedDate = myDateObj.format(myFormatObjTime);
		System.out.println("after format time: "+formatedDate);
		
		
	}

}
