package br.com.rodrigoluisfaria.chalanges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Problem2663 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfCompetitor = scanner.nextInt();
		int numberOfMinClassification = scanner.nextInt();
		List<Integer> pontuation = new ArrayList<Integer>();
		
		for (int i = 0; i < numberOfCompetitor; i++) {
			int points = scanner.nextInt();
			pontuation.add(points);
		}
		
		Collections.sort(pontuation, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		
		int response = numberOfMinClassification;
		int points = pontuation.get(numberOfMinClassification - 1);
		while (true) {
			if (pontuation.size() > response && pontuation.get(response) == points) {
				response++;
			} else {
				break;
			}
		}
		
		System.out.println(response);
		scanner.close();
	}
}
