package lv.kristine2.learnstring;

public class TestStringClass {

	public static void main(String[] args) {
		String str = "Ind ex";
		
		String strClass = new String("Index param ");
		
		
		System.out.println(str);
		System.out.println("string like object "+strClass);
		
		int stringLenght = str.length();
		System.out.println(stringLenght);
		
		
		System.out.println(str.charAt(4));
		
		System.out.println(str.toUpperCase());
		
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "NotHello";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(!s1.equals(s2));
		System.out.println(!s2.equals(s3));
		
	}

}
