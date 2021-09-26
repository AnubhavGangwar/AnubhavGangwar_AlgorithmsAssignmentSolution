package com.Anubhav_Graded_Assingment_2;

public class Comparison {

	public void priceRose(boolean compare_price[]) {
		int x = 0;
		for (int i = 0; i < compare_price.length; i++) {
			if (compare_price[i] == true)
				x = x + 1;
		}
		System.out.println("Total number of companies for which stock price rose today : " + x);

	}

	public void priceDecline(boolean compare_price[]) {
		int y = 0;
		for (int i = 0; i < compare_price.length; i++) {
			if (compare_price[i] == false)
				y = y + 1;
		}
		System.out.println("Total number of companies for which stock price declined today : " + y);

	}

}
