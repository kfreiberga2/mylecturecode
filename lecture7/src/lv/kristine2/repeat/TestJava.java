package lv.kristine2.repeat;

import java.util.Scanner;

public class TestJava {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tavs vārds:");
		int inputValue=12;
		
		
	
			while(input.hasNextInt()){
				if(input.nextInt()){
					System.out.println("Input is  number, write NAME!");										
				}else{
					System.out.println("ievadi vardu");
				};
				
				
		}
		
		
		
		System.out.println("your name is : "+input.nextInt());
		
	}

}
