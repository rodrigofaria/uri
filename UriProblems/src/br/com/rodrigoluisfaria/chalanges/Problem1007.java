package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1007 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		int a4 = scanner.nextInt();
		
		int result = (a1 * a2) - (a3 * a4);
		System.out.println("DIFERENCA = " + result);
		scanner.close();
	}
}
