public class TestIfElseAndBlocks {

	public static void main(String[] args) {

		System.out.println("==========");
		System.out.println("==========");

		
		boolean test = true;
		int result;
		
		
		if (test){
			int number= 100;
			System.out.println("TRUE");
			System.out.println(number);
			result = number + number;
			System.out.println("Result vakue is: "+result);
			
		}else{
			System.out.println("FALSE");
		}
		
		
		System.out.println("After if else block");
		
		
		boolean test2 = true;
		if (test2){
			System.out.println("TRUE");
			int number = 130;
			result = number + number;
			System.out.println(result);
		}else{
			System.out.println("FALSE");
		}

	}

}
