package br.com.rodrigoluisfaria.chalanges;

import java.util.Scanner;

public class Problem1028 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfGames = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < numberOfGames; i++) {
			String cards = scanner.nextLine();
			String[] cardsStr = cards.split(" ");
			
			int a = Integer.parseInt(cardsStr[0]);
			int b = Integer.parseInt(cardsStr[1]);
			
			System.out.println(mdc(a, b));
		}
		
		scanner.close();
	}
	
	private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
