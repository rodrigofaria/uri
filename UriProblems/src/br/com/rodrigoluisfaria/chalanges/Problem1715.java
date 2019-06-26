package br.com.rodrigoluisfaria.chalanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1715 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		while (in.ready()) {
			String line = in.readLine();
			int numberOfPlayers = Integer.parseInt(line.split(" ")[0]);
			int count = 0;
			
			for (int i = 0; i < numberOfPlayers; i++) {
				line = in.readLine();
				
				if (line.indexOf(" 0 ") == -1 && !line.startsWith("0 ") && !line.endsWith(" 0")) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
	
}
