import java.util.Random;
import java.util.Scanner;


public class LoopTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int random = rand.nextInt(10) + 1;
		
		while (true) {
		    System.out.print("Pick a number 1-10: ");
		    int number = sc.nextInt();
		    if (number == random) {
		        System.out.println("Good!");
		        break; // This ends the loop
		    } else if (number > random) {
		        System.out.println("Too Big");
		    } else if (number < random) {
		        System.out.println("Too Small");
		    }
		}	
	}

}
