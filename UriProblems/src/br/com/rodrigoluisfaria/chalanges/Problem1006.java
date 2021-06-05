package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double average = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10;
		
		System.out.println(String.format("MEDIA = %.1f", average));
		scanner.close();
	}
}
