package lv.kristine2.repeat;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		final double TAX_RATE_20k = 0.1;
		final double TAX_RATE_30k = 0.2;
		final double TAX_RATE_40k = 0.3;
		final int SENTINEL = -1;

		int taxableIncome;
		double taxPayable;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter taxable income:");
		taxableIncome = sc.nextInt();

		while (taxableIncome != SENTINEL) {
			if (taxableIncome > 40000) {
				taxPayable = taxableIncome * TAX_RATE_40k;
				
			} else if (taxableIncome > 30000) {
				taxPayable = taxableIncome * TAX_RATE_30k;
			} else if (taxableIncome > 20000) {
				taxPayable = taxableIncome * TAX_RATE_20k;

			} else {
				taxPayable = 0;
			}

			System.out.println("tax need to pay " + taxPayable);
			System.out.println("enter taxable income : $");
			taxableIncome = sc.nextInt();	
			
			
		}
		System.out.println("end!");
	}
}
