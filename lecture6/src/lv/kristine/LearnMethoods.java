package lv.kristine;

public class LearnMethoods {

	public static void main(String[] args) {
		// void = not return type - atgriez visu, ko apstada;
		// static = nevajag veidot klases objektu, lai izsauktu metodi
		
		// main metode m ak atrast citu metodi un palaist to
		getMyName();
		getMyName();
		getMyName();
		System.out.println("-----------------------------");
		getMyCity();
		
				
		LearnMethoods classObject = new LearnMethoods();  //izveido klasē klases objektu
		classObject.doYouHaveCat();
		
		doYouHaveCat();
		
	}

	public static void getMyName() {
		System.out.println("My name is Kristine");
	}

	public static void getMyCity() {
		getMyName();
		System.out.println("My city is Jurmala");
	}

	
		public static void doYouHaveCat() {
		System.out.println("No");
}

}
