package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1933 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		
		if (a1 == a2) {
			System.out.print(a1);
		} else if (a1 > a2) {
			System.out.print(a1);
		} else {
			System.out.print(a2);
		}
		scanner.close();
	}
}
