package lv.kristine;

import java.util.Scanner;

public class TestScannerInputArray {

	public static void main(String[] args) {

		String[] strArr = new String[3];

		Scanner sc = new Scanner(System.in);
		System.out.println(strArr.length + " users in array");
		for (int i = 0; i < strArr.length; ++i) {
			strArr[i] = sc.nextLine();
		}

		System.out.println("Do you wanna print array?");
		System.out.println("Type (Print)");
		System.out.println("Type (notPrint)");
		String statusCheck = sc.nextLine();
		
		if (statusCheck.equals("Print")){
			printArray(strArr);
		}else if(statusCheck.equals("notPrint"));{
			System.out.println("Exit");
		}else{
			System.out.println("Wrong data");
		}
	}
	
		
		public static void printArray (String []strArr ){
				
			}
				}
			

