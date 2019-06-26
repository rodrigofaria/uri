package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem2670 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		
		int minutesCase1 = a2 * (2) + a3 * (2 * 2);
		int minutesCase2 = a1 * (2) + a3 * (2);
		int minutesCase3 = a2 * (2) + a1 * (2 * 2);
		
		if (minutesCase1 <= minutesCase2 && minutesCase1 <= minutesCase3) {
			System.out.print(minutesCase1);
		} else if (minutesCase2 <= minutesCase1 && minutesCase2 <= minutesCase3) {
			System.out.print(minutesCase2);
		} else {
			System.out.print(minutesCase3);
		}
		scanner.close();
	}
}
