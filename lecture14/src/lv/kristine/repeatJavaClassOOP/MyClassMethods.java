package lv.kristine.repeatJavaClassOOP;

public class MyClassMethods {
	
	
	public MyClass myClass;  //instances mainīgais vārdā MyClass ar tipu MyClass
	
//	public MyClass createNewObjMyClass(){
//		return new MyClass();
//		
//	}
	public MyClassMethods (MyClass myClass){
		this.myClass = myClass;
		
	}

	
	static void myMethod(){
		System.out.println("Hello World!");
	}
	
	public String myStringMethod(){
		myMethod();
		return  "abc";
		
	}
	
	public double returnDouble(){
		return 60.3;
			 }
	
	public char returnChar(int a, int b){
		
		int charFromInt = a+b;
		
		
		char charVariable = (char)charFromInt;
		
		return charVariable;
		
	}
	
}
