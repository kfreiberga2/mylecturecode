
public class IfElseAndTernaryOperator {

	
	public static void main(String[] args) {
		
											// Ternary operator '?'
		
		boolean test = false;
		
		if(test){
			System.out.println("Test pass true");
		}else{
			System.out.println("Test pass false");
		}
		
		String stringExp = "te ir string vērtība";
		
		
		String res = (test) ? "true rezultats":"false rezultats";
		System.out.println(res);
		
		System.out.println("-----------------------");
		
		int num1=9;
		int num2= 7;
		int result;
		
		result= (num1>num2) ? ('a'+num2): (num1-num2) ; //paņēma a kā čharu
		// Ternary variable  = (condition) ? return true:return false
		System.out.println(result);
	}

}
