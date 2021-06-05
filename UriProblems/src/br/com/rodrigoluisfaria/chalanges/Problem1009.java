package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String personName = scanner.nextLine();
		double fixedSalary = scanner.nextDouble();
		double totalSales = scanner.nextDouble();
		double commission = 0.15;
		double totalSalary = fixedSalary + (totalSales * commission);
		
		System.out.println(String.format("TOTAL = R$ %.2f", totalSalary));
		scanner.close();
	}
}
