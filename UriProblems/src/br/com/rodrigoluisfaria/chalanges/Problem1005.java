package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double average = ((a * 3.5) + (b * 7.5)) / 11;
		
		System.out.println(String.format("MEDIA = %.5f", average));
		scanner.close();
	}
}
