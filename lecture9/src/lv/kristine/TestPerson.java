package lv.kristine;

import lv.kristine.user.Teacher;

public class TestPerson {

	
	public static void main(String[] args) {
		String [] strArr = new String[12];
		strArr [0]="Sport";
		strArr [1]="Math";
		strArr[2]="Bio";
		System.out.println(strArr [0]+", "+strArr [1]);
		
		Teacher teacher1 = new  Teacher("Toms", "Riga");
		System.out.println(teacher1.toString());
		
//		teacher1.addCourses("Sport");
//		teacher1.addCourses("Math");
//		teacher1.addCourses("Biology");
//		teacher1.addCourses("History");
		
		String [] courses ={"Sport"+"Math"+"Biology"+"History"};
		//for-each loop
		
		for(String course: courses){
			teacher1.addCourse (course);
		}
				
	}

}
