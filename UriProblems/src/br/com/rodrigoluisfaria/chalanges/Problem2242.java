package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem2242 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String laughter = scanner.next();

		String laughterWithoutConsoants = laughter.replaceAll("[a-z&&[^aeiou]]", "");
		
		String laughterInverted = "";
		
		for (int i = laughterWithoutConsoants.length() - 1; i >= 0; i--) {
			laughterInverted += laughterWithoutConsoants.charAt(i);
		}
		
		if (laughterInverted.equals(laughterWithoutConsoants)) {
			System.out.println("S");
		} else {
			System.out.println("N");			
		}
		scanner.close();
	}
}
