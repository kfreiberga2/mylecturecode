
public class OperatorsMath {

	public static void main(String[] args) {
		double num1=0.4;
		double num2=0.20;
		double result;
		double result1;
		double result2;
		double result3;
		
		char add= '+';
		char sub= '-'	;
		char multi= '*'	;	
		char divi= '/'	;	

		result= num1 + num2;
		result1=num1-num2;
		result2=num1*num2;
		result3=num1/num2;

		
		System.out.println(num1+ " "+add+" "+num2+ " "+"=" +result);
		System.out.println(num1+ " "+sub+" "+num2+ " "+"=" +result1);
		System.out.println(num1+ " "+multi+" "+num2+ " "+"=" +result2);
		System.out.println(num1+ " "+divi+" "+num2+ " "+"=" +result3);
		System.out.println();

		
		int a= 11;
		int b=4;
		int x= a % b;
		System.out.println("x= "+x);
		
		int i=6;
		i++;
		System.out.println(i);
		
		int k =2;
		//return increment result by value 1
		int p = ++k;
		System.out.println("p after increment: " +p);
		
		int o =2;
		int f = o++;
		System.out.println("p after increment: "+f);
		
		
	}

}
