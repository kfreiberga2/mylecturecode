package lv.kristine;

public class RefactorMethod {

	public static void main(String[] args) {

		
		System.out.println(getGreeting(22));
		getGreetingWithVoid(3);
		double number = 20.45;
		int num = (int)number;
		System.out.println(num);
	}

	public static String getGreeting(int time){
			if (time<8){
				return "Good morning";
			}else if(time<18){
				return "Good day";
			}else{
				return "Good evening";
			}
		}
	
	public static void getGreetingWithVoid(int time){
		
		if (time<8){
			System.out.println("Good morning");
		}else if(time<18){
			System.out.println("good day");
		}else{
			System.out.println("Good evening");
		}
		
	}
}
