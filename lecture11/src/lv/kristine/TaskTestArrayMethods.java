package lv.kristine;

import java.util.ArrayList;

public class TaskTestArrayMethods {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();

		cars.add("BMW");
		cars.add("Audi");
		cars.add("Mazda");
		cars.add("Ford");
		System.out.println(cars.indexOf("Audi"));
		System.out.println(cars.isEmpty());
		System.out.println(cars.get(3));
		System.out.println(cars.set(0, "Opel"));
		cars.clear();
		
		
		System.out.println("------------------------------");
		
		
		for (String c : cars) {
			System.out.println(c);
		}

		System.out.println(cars.size());
		cars.remove("jjj");
		
		for (String c : cars) {
			System.out.println(c);
		}
		
		System.out.println(cars.size());
	}

}
