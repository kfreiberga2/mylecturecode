package lv.kristine2.repeatarray;

import java.util.Scanner;

public class ScannerAndArrays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [] arr =new int [3];
		
		System.out.println("Input first array value:");
		arr [0]=sc.nextInt();
		System.out.println("Input second array value:");
		arr [1]=sc.nextInt();
		
		
		
		System.out.println(arr [0]+", "+arr[1]);

	}

}
