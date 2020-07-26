package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1040 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float n1 = scanner.nextFloat();
		float n2 = scanner.nextFloat();
		float n3 = scanner.nextFloat();
		float n4 = scanner.nextFloat();
		
		float average = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10;
		
		
		System.out.println(String.format("Media: %.1f", average));
		if (average >= 7.0f) {
			System.out.println("Aluno aprovado.");	
		} else if (average < 5.0f) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			
			float nExame = scanner.nextFloat();
			System.out.println(String.format("Nota do exame: %.1f", nExame));
			
			float newNote = (average + nExame) / 2;
			
			if (newNote >= 5.0f) {
				System.out.println("Aluno aprovado.");	
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println(String.format("Media final: %.1f", newNote));
		}
		
		scanner.close();
	}
}
