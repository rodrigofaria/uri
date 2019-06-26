package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem2880 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a1 = scanner.next();
		String a2 = scanner.next();
		
		int startPosition = 0;
		int count = 0;
		
		while (startPosition + a2.length() <= a1.length()) {
			boolean match = false;
			for (int i = 0; i < a2.length(); i++) {
				if (a1.charAt(startPosition + i) == a2.charAt(i)) {
					match = true;
					break;
				}
			}
			
			count = match ? count : count + 1;			
			startPosition++;
		}
		
		System.out.println(count);
		scanner.close();
	}
}
