package lv.kristine;

import java.util.ArrayList;

public class TestCarsWithArrayList {

	
	public static void main(String[] args) {
		ArrayList <String> cars = new ArrayList<>();
		
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Mazda");

		for(String c: cars){
			System.out.println(c);
		}
	}

}
