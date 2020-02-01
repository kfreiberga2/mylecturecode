package lv.kristine.interfaces;

public class Rectangle implements Shape {
	private int lenght;
	private int width;
												// konstruktoru veido iekšs klases
	public Rectangle (int l, int w){   		// konstruktors ar dieviem mainigajiem
		this.lenght = l;
		this.width = w;
		
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
	}
	@Override
	public double getArea() {
		
		return lenght*width;
	}
	
	
	
	
	
}
