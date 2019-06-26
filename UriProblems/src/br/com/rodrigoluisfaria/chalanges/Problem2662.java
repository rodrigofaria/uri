package br.com.rodrigoluisfaria.chalanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2662 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] notas = {"do", "do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la", "la#", "si",
				"do", "do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la", "la#", "si",
				"do", "do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la", "la#", "si",
				"do", "do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la", "la#", "si",
				"do", "do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la", "la#", "si",
				"do"
				};
		
		List<List<String>> escalas = new ArrayList<>();
		
		int[] sequence = {2, 2, 1, 2, 2, 2, 1};
		
		for (int i = 0; i < 12; i++) {
			List<String> escala = new ArrayList<>();
			escala.add(notas[i]);
			int position = i;
			for (int x : sequence) {
				position += x;
				escala.add(notas[position]);
			}
			escalas.add(escala);
		}
		
		int numberOfNotes = scanner.nextInt();
		List<Integer> allNotes = new ArrayList<Integer>(numberOfNotes + 1);
		
		for (int i = 0; i < numberOfNotes; i++) {
			int note = scanner.nextInt();
			allNotes.add(note);
		}
		
		for (int i = 0; i < escalas.size(); i++) {
			List<String> escala = escalas.get(i);
			boolean matchAll = true;
			
			for (int j = 0; j < allNotes.size(); j++) {
				if (!escala.contains(notas[allNotes.get(j) - 1])) {
					matchAll = false;
					break;
				}
			}
			
			if (matchAll) {
				System.out.println(escala.get(0));
				scanner.close();
				return;
			}
		}
				
		System.out.println("desafinado");
		scanner.close();
	}
}
