package br.com.rodrigoluisfaria.chalanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1709 {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		while (in.ready()) {
			String line = in.readLine();
			int numberOfCarts = Integer.parseInt(line.split(" ")[0]);
			int position = 1;
			int counter = 0; 
			int midle = numberOfCarts / 2;
			
			
			do {
				counter++;
				
				if (position <= midle) {
					position *= 2;
				} else {
					position = (position - midle) * 2 - 1;
				}
				
			} while (position != 1);
			
			System.out.println(counter);
		}
	}

}
