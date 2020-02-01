package lv.kristine;

public class TestArraysAndLists {

	public static void main(String[] args) {
		String[] arr = new String[10];
		String[] arrWith = { "6", "71", "11", "15", "18", "19", "67", "32", "74", "99" };
		arrToString(arr);
		addElementsToArr(arr);

		System.out.println();

		arrToString(arrWith);

		for (int i = 0; i < arrWith.length; i++) {
			System.out.println("index number is " + i + " " + arrWith[i]);
		}
	}

	public static void arrToString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("index number is " + i + " " + arr[i]);
		}
	}
	
	public static void addElementsToArr(String []arr){
		for(int i = 0; i < arr.length; i++){
			arr[i]= arr[i]+i;
			
		}
		arrToString(arr);
	}
	
}
