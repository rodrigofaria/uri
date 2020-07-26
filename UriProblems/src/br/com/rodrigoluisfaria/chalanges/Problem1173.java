package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1173 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int r = scanner.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("N[" + i + "] = " + r);
			r *= 2;
		}
		
		scanner.close();
	}
}
