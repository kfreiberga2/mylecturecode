
public class ArraysPrimitiveDataType {

	
	public static void main(String[] args) {
		
		int[] arrays; //Declare array with type int
		arrays = new int[2] ;
		
		int[] arr = new int[10];
		
		int[] arrTest = new int [5];
		
		arrTest[0] = 10;
		arrTest[1]= 3;
		arrTest[4]=4;
		
		System.out.println(arrTest[0]+" "+arrTest[1]+" "+arrTest[2]+" "+arrTest[3]+" "+arrTest[4]);
		System.out.println("----------------------------------------------------");
		
		double[] doubleArrays = new double[4];
		doubleArrays[0] = 0.5;
		doubleArrays[1]= 5;
		doubleArrays[2]=2.5;
		doubleArrays[3]=3.5;
		System.out.println(doubleArrays[0]+" "+doubleArrays[1]+" "+doubleArrays[2]+" "+doubleArrays[3]);
		
		System.out.println("----------------------------------------------------");

		
		char[] charArray = new char [2];
		charArray[0]=77;
		charArray[1]='a';
		System.out.println(charArray[0]+" "+charArray[1]);
		
		boolean[] booleanArray = new boolean [2];
		booleanArray[0]=true;
		booleanArray[1]=false;
		System.out.println(booleanArray[0]+" "+booleanArray[1]);
		
		System.out.println("----------------------------------------------------");

		int checkLenght = arrTest.length;
		int checkLenght2 = booleanArray.length;
		System.out.println("Array lenght is: "+checkLenght);
		System.out.println("Array lenght is: "+checkLenght2);
		
		System.out.println(booleanArray[booleanArray.length-1]);

	}

}
