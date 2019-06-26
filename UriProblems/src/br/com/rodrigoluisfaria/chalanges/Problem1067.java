package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1067 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int r = scanner.nextInt();
		int i = 1;
		
		while (i <= r) {
			System.out.println(i);
			i += 2;
		}
		
		scanner.close();
	}
}
