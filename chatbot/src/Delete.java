import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Delete {

	
	public static void main(String[] args) {
		List <String> jokes = new ArrayList<>();
		jokes.add("joke1");
		jokes.add("joke2");
		jokes.add("joke3");
		jokes.add("joke4");
		
		System.out.println("choose joke1/joke2");
		Scanner sc =new Scanner (System.in);
		String userInout = sc.next();
		System.out.println(jokes);
	
		Iterator<String> itr = jokes.iterator(); 
		while (itr.hasNext()) {
		      String joke = itr.next();
		      if (joke.equals("joke")) {
		        itr.remove();
		      }
		    }
		System.out.println(jokes);
	}
	
}
