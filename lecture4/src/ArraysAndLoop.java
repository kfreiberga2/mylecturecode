import java.util.Arrays;

public class ArraysAndLoop {

	public static void main(String[] args) {
		// Declare variable
		int [] marks = {76,23,56,11,78,28,88};
		//  Make toString all elements of array
		// Print to console
		// out.println is print new line
		// out.print print in one line
		
		for (int i=0; i<marks.length; i++){
			System.out.println(marks[i]);
			}
		
		
		
		
		
		System.out.print("[ ");
		
		for (int i=0; i<marks.length-1; i++){
			System.out.print(marks[i]+", ");
		}
		System.out.println(marks[marks.length-1]+"]");
		
		System.out.println(marks.length-1);
		
		
		
		
		
		
		System.out.println(Arrays.toString(marks));
		
		
		
	}
}
