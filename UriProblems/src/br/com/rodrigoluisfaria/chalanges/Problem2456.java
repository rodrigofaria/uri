package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem2456 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String cards = scanner.nextLine();

		String[] cardsStr = cards.split(" ");
		
		int current = 0;
		int last = 0;
		boolean increasingly = true;
		boolean decreasingly = true;
		
		for (int i = 0; i < cardsStr.length; i++) {
			last = current;
			current = Integer.parseInt(cardsStr[i]);
			if (i > 0) {
				
				if (current > last) {
					decreasingly = false;
				} else if (current < last) {
					increasingly = false;
				}
			}
		}

		if (increasingly) {
			System.out.println("C");
		} else if (decreasingly) {
			System.out.println("D");
		} else {
			System.out.println("N");
		}
		scanner.close();
	}
}
