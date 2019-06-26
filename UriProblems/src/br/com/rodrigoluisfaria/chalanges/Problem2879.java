package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem2879 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int winners = 0;
		int times = scanner.nextInt();
		
		for (int i = 0; i < times; i++) {
			int a1 = scanner.nextInt();
			
			if (a1 > 1) {
				winners++;
			}
		}
		
		System.out.println(winners);
		scanner.close();
	}
}
