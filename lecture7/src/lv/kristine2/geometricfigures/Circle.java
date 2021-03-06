package lv.kristine2.geometricfigures;

public class Circle {

	public static final double DEFAULT_RADIUS = 8.8; // konstantes
	public static final String DEFAULT_COLOR = "red";

	private double radius; // instances mainigie
	private String color;

	// zemak ir konstruktors
	public Circle() {
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}

	public Circle(double r) {
		this.radius = r;
		this.color = DEFAULT_COLOR;
	}

	public Circle(double rad, String c) {
		this.radius = rad;
		this.color = c;
	}

		
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public  double getArea(){
		
		return this.radius*this.radius*Math.PI;				
	}
	public String toString(){
		return "Circle ";
	}
	
	
	
	
}
