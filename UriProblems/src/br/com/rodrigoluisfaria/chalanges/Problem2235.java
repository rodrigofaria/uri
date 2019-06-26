package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem2235 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		
		if (a1 + a2 == a3 || a1 + a3 == a2 || a2 + a3 == a1 || a1 == a2 || a1 == a3 || a2 == a3) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		scanner.close();
	}
}
