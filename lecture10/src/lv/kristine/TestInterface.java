package lv.kristine;

import lv.kristine.interfaces.Rectangle;
import lv.kristine.interfaces.Shape;
import lv.kristine.interfaces.Triangle;

public class TestInterface {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 34;
		
		
		Rectangle rect = new Rectangle(num1, num2);
		System.out.println(rect.getLenght()+ ", "+rect.getWidth());
		
		Shape figure1 = new Rectangle(5,10);
		System.out.println(figure1.toString());
		System.out.println(figure1.getArea());
		
		
		Shape figure2 = new Triangle(7,8);
		System.out.println(figure2.toString());
		System.out.println("laukums ir "+figure2.getArea());
	}
}
