package lv.kristine.learnjavaclass;

public class TestJavaProgramm {

	public static void main(String[] args) {

		Box boxObject = new Box();

		//double result = boxObject.getVolume();
		
		double volume;

		double width = 20.23;
		boxObject.width = width; // jeb boxObject.width=20.23
		boxObject.height = 3.42;
		boxObject.depth = 15.3;
		
		double result = boxObject.getVolume();
		
		System.out.println("Volume from method: " + result);

		volume = boxObject.width * boxObject.height * boxObject.depth;
		System.out.println("volume: " + volume);

		Box boxObject2 = new Box();
		System.out.println(boxObject2.width);
	}

}
