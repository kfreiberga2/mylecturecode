public class Calculator {

	public static void main(String[] args) {

		char operatorMath = '%';
		double num1 = 11;
		double num2 = 3;
		double result;

		if (operatorMath == '+') {
			result = num1 + num2;
			System.out.println(num1 + num2);

		} else if (operatorMath == '/') {
			result = num1 / num2;
			System.out.println(num1 / num2);
		} else if (operatorMath == '*') {
			result = num1 * num2;
			System.out.println(num1 * num2);

		} else if (operatorMath == '%') {
			if (num1 > num2) {
				result = num1 % num2;
				System.out.println(num1 % num2);

			} else {
				System.out.println("wrong data");
			}

		}
		System.out.println("--------------------------");

		switch (operatorMath) {
		case '+':
			result = num1+num2;
			System.out.println(num1 + num2);
			break;
		case '-':
			result = num1-num2;
			System.out.println(num1 - num2);
			break;
		case '%':
			if(num1>=num2){
				result = num1%num2;
				System.out.println(result);
			}else{
				System.out.println("if num1>num2, result is num1: "+num1);
			}
		
			break;
		case '/':
			result = num1/num2;
			System.out.println(num1 / num2);
			
		default:
			System.out.println("No such number or operator");

		}
	}

}
