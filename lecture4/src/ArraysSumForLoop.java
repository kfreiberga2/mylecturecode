public class ArraysSumForLoop {

	public static void main(String[] args) {
		int[] marks = { 76, 23, 5 };
		// sum all values in arrays
		// print to console

		// int result = 10;
		// System.out.println("result value:" +result);
		//
		// int testInt = 90;
		// result = testInt;
		// System.out.println("result value:" +result);

		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		System.out.println("sum of marks: " + sum);
		System.out.println(marks[0] + marks[1]);
		int sumTest = 0;
		sumTest += 200;
		sumTest += 220;
		sumTest = sumTest + 240;
		System.out.println("testing += operator: " + sumTest);

		int suboperator = 1000;
		suboperator = suboperator - 200;
		suboperator -= 150;
		suboperator -= 100;

		System.out.println("testing -= operator: " + suboperator);

	}

}
