package lv.kristine.repeatJavaClassOOP;

public class TestOOP {

	public static void main(String[] args) {
		MyClass newObj = new MyClass();

		MyClass newObj2 = new MyClass();
		String strObj = "hello";
		String strObj2 = "hello";

		System.out.println(newObj.equals(newObj2));
		System.out.println(strObj.equals(strObj2));
		System.out.println(strObj == strObj2);

		System.out.println(newObj.x);

		// MyClassMethods myObjMethod = new MyClassMethods();
		// myObjMethod.myMethod();
		// myObjMethod.myStringMethod();
		// System.out.println(myObjMethod.myStringMethod());
		//
		// double numberDouble = myObjMethod.returnDouble();
		// System.out.println(numberDouble);
		//
		// System.out.println(myObjMethod.returnChar(20, 20));

		MyClassConstructor myConstructorObj = new MyClassConstructor(1990L,
				"BMW");
		MyClassConstructor myConstructorObj2 = new MyClassConstructor(2010L,
				"Opel");
		System.out.println("+++++++++++++++");
		myConstructorObj.getModelNAme()
				.equals(myConstructorObj2.getModelNAme());
		System.out.println(myConstructorObj.getModelNAme().equals(
				myConstructorObj2.getModelNAme()));

		System.out.println(myConstructorObj.getModelNAme());

		EncapsClass encapObj = new EncapsClass();
		System.out.println(encapObj.getUser());
		encapObj.setUser("Kristine");
		System.out.println(encapObj.getUser());

		ImplementInterface implObj = new ImplementInterface();
		implObj.sendEmail();
		System.out.println(implObj.sendEmailCount());

		Fruits abols = Fruits.APPLE;
		System.out.println("May favorite fruit is  " + abols);

		switch (abols) {
		case PEAR:
			System.out.println("fruit ir pear");
			break;
		case APPLE:
			System.out.println("fruit is apple");
			break;
		}

		String numberStr = "240";
		int numberInt = Integer.parseInt(numberStr);
		System.out.println(numberInt+33);
		
		ClasseExtendsAbstractClass  objAbstractClass =new ClasseExtendsAbstractClass();
		objAbstractClass.sleep();
		objAbstractClass.abstractMethod();
		
	}

}
