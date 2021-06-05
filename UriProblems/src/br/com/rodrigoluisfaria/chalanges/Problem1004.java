package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1004 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		long prod = a * b;
		
		System.out.println("PROD = " + prod);
		scanner.close();
	}
}
