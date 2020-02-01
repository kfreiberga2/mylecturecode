package lv.kristine;

import lv.kristine.encapsulation.Student;

public class TestEncapsulation {
	
	public static void main (String []args){

	Student student = new Student ();
	
	student.setName("Toms");
	System.out.println(student.getName());
	
	}
}
