package br.com.rodrigoluisfaria.chalanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2694 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> result = new ArrayList<>();
		int sum = 0;
		int words = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < words; i++) {
			String word = scanner.nextLine();
			
			word = word.replaceAll("[^\\d.]", " ").trim();
			String[] numbers = word.split("\\s+");
			for (String number : numbers) {
				sum += Integer.parseInt(number);
			}
			result.add(sum);
			sum = 0;
		}
		
		for (Integer integer : result) {
			System.out.println(integer);
		}
		scanner.close();
	}
}
