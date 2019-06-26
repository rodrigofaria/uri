package br.com.rodrigoluisfaria.chalanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2884 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfInterruptores = scanner.nextInt();
		int numberOfLamps = scanner.nextInt();
		int numberOfLampsOn = scanner.nextInt();
		List<Integer> allLamps = new ArrayList<Integer>(numberOfLamps + 1);
		allLamps.add(-2);
		
		for (int i = 1; i <= numberOfLamps; i++) {
			allLamps.add(0);
		}
		
		for (int i = 0; i < numberOfLampsOn; i++) {
			int lamp = scanner.nextInt();
			allLamps.set(lamp, 1);
		}
		
		int[][] interruptoresLigadosALampadas = new int[numberOfInterruptores][numberOfLamps];
		for (int i = 0; i < numberOfInterruptores; i++) {
			int lamps = scanner.nextInt();
			for (int j = 0; j < lamps; j++) {
				int lamp = scanner.nextInt();
				interruptoresLigadosALampadas[i][j] = lamp;
			}
		}
		
		int count = 0;
		MAIN: while (true) {
			for (int i = 0; i < numberOfInterruptores; i++) {
				count++;
				
				for (int j = 0; j <	interruptoresLigadosALampadas[i].length; j++) {
					if (interruptoresLigadosALampadas[i][j] > 0) {
						int state = allLamps.get(interruptoresLigadosALampadas[i][j]);
						int newState = state == 1 ? 0 : 1;
						allLamps.set(interruptoresLigadosALampadas[i][j], newState);
					}
				}
				
				if (!allLamps.contains(1)) {
					break MAIN;
				}
			}
			
			if (count == numberOfInterruptores * 2) {
				count = -1;
				break;
			}
		}
		
		System.out.println(count);
		
	}
}
