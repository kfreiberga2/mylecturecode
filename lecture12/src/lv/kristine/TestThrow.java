package lv.kristine;

public class TestThrow {

	public static void main(String[] args) {
		checkAge(10);
	}

	public static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Acces denied asdas");
		} else {
			System.out.println("Acces grented");
		}
	}

}