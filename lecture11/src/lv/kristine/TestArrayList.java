package lv.kristine;

import java.util.ArrayList;

public class TestArrayList {

	
	public static void main(String[] args) {
		
		String []arr = new String[2];
		System.out.println(arr.length);
		arr[0]="first element of array";
		System.out.println(arr[0]);
		
		ArrayList<String> array =new ArrayList<>();
		System.out.println(array.size());
		array.add("apple");
		array.add("pear");
		array.add("kiwi");
		System.out.println(array);
		System.out.println(array.size());
		
		
		
		
	}

}
