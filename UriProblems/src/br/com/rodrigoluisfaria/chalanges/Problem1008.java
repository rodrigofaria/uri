package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int workedHours = scanner.nextInt();
		double salaryByHour = scanner.nextDouble();
		double result = workedHours * salaryByHour;
		
		System.out.println("NUMBER = " + number);
		System.out.println(String.format("SALARY = U$ %.2f", result));
		scanner.close();
	}
}
