package lv.kristine;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayWithObject {


	public static void main(String[] args) {
		 
		Integer intObj = 40;
		Double doubleObj = 40.23;
		
		System.out.println(intObj);
		
		
		
		ArrayList<Integer> intArrays = new ArrayList<>();
		
		intArrays.add(23);
		intArrays.add(92);
		intArrays.add(4);
		intArrays.add(15);
		intArrays.add(60);
		intArrays.add(26);
		
		System.out.println(intArrays);
		Collections.sort(intArrays);
		
		System.out.println(intArrays);
		
		
	}

}
