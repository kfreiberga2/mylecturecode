package lv.kristine;

public class LearnMethodsWithParametrs {

	public static void main(String[] args) {
		double radius = 30.2;
		String color = "red";
		
		int resultWithCastInt = getArea(radius); //this metod cast double 
		double result = getAreaForCircle(radius);
		
		
		System.out.println("Area: " + result);
		System.out.println(getColorAndArea(color,result));
	}

	public static int getArea(double radius) {
		double result = Math.PI * radius * radius;
		return (int) result;
	}
	
	
	public static double getAreaForCircle(double radius) {
		double result = Math.PI * radius * radius;
		return result;		
	}

	public static String getColorAndArea (String color, double area){
		return "Color: "+color+ " and area" + area;
		
	}
}
