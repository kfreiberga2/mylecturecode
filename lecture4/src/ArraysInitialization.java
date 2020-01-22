import java.util.Arrays;

public class ArraysInitialization {

	public static void main(String[] args) {
		int[] numbersOfArrays = { 33, 45, 23, 56 };
		int lenghtOfArrays = numbersOfArrays.length;
		System.out.println(lenghtOfArrays);

		numbersOfArrays[3]=20;
		System.out.println(Arrays.toString(numbersOfArrays));
	}

}
