package br.com.rodrigoluisfaria.chalanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1940 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		//scanner.nextLine();
		int max = a1 * a2;
		
		List<Integer> points = new ArrayList<>(a1);
		int player = 1;
		boolean isToSet = false;
		
		for (int i = 0; i < max; i++) {
			int point = scanner.nextInt();
			int sum = 0;
			if (points.size() >= player) {
				sum = points.get(player - 1);
			}
			sum += point;
			if (isToSet) {
				points.set((player - 1), sum);
			} else {
				points.add((player - 1), sum);
			}
			player++;
			if (player > a1) {
				player = 1;
				isToSet = true;
			}
			
		}
		
		int highest = points.get(0);
		int winner = 0;
		for (int i = 0; i < points.size(); i++) {
			if (highest <= points.get(i)) {
				highest = points.get(i);
				winner = i;
			}
		}
		
		System.out.println(++winner);
		scanner.close();
	}
}
