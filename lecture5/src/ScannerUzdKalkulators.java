import java.util.Scanner;

public class ScannerUzdKalkulators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// syso (result = num 1 + num2)

		System.out.println("enter number1: ");
		int num1 = sc.nextInt();

		System.out.println("enter number2:");
		int num2 = sc.nextInt();

		sc.nextLine();

		System.out.println("Input operator /+-% : ");

		String operatorSymbol = sc.nextLine();

		int result = 0;
		if (operatorSymbol.equals("+")) {
			result = num1 + num2;
		} else if (operatorSymbol.equals("%")) {
			result = num1 % num2;
		} else if (operatorSymbol.equals("/")) {
			result = num1 / num2;
		} else {
			System.out.println("wrong operator");
		}
		System.out.println("Test result is " + result);
		System.out.println(result+"="+num1+operatorSymbol+num2);

	}

}
