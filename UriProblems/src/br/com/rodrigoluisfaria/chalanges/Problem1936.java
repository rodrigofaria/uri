package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1936 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		int temp = a1;
		int sum = 1;
		int count = 0;
		int i = 1;
		
		while (true) {
			if (temp == 1) {
				count++;
				break;
			}
			do {
				sum = sum + sum * i;
				i++;
			} while ((sum + sum * i) <= temp);
			
			count++;
			temp = temp - sum;
			i = 1;
			sum = 1;
			if (temp == 0) {
				break;
			}
		}
		
		System.out.println(count);
		scanner.close();
	}
}
