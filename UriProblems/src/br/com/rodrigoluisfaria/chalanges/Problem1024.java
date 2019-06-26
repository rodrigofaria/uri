package br.com.rodrigoluisfaria.chalanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1024 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> output = new ArrayList<>();
		int a1 = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < a1; i++) {
			StringBuilder newWord = new StringBuilder();
			String word = scanner.nextLine();
			
			for (int j = 0; j < word.length(); j++) {
				char letter = word.charAt(j);
				if ( Character.isLowerCase(letter) || Character.isUpperCase(letter) ) {
					int ascValue = (int) letter;
					ascValue += 3;
					letter = (char) ascValue;
				}
				newWord.append(letter);
			}
			
			newWord.reverse();
			long d = Math.round(word.length() / 2.0) ;
			
			for (int j = (int) (word.length() - d); j < word.length(); j++) {
				char letter = newWord.charAt(j);
				int ascValue = (int) letter;
				ascValue -= 1;
				letter = (char) ascValue;
				newWord.setCharAt(j, letter);
			}
			
			output.add(newWord.toString());
		}

		
		for (String string : output) {
			System.out.println(string);
		}
		scanner.close();
	}
}
