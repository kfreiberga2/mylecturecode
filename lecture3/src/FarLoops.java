public class FarLoops {

	public static void main(String[] args) {

		System.out.println("Number " + 1);
		System.out.println("Number " + 2);
		System.out.println("Number " + 3);

		System.out.println("---------------------");

		for (int i = 90; i <= 100; i++) {
			System.out.println("Number " + i);
		}
		System.out.println("---------------------");

		for (int i = 80; i >= 70; i--) {
			System.out.println("Number " + i);
		}
	}
}
