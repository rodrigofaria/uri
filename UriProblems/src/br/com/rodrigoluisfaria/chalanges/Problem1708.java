package br.com.rodrigoluisfaria.chalanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1708 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		while (in.ready()) {
			String line = in.readLine();
			int timeFastest = Integer.parseInt(line.split(" ")[0]);
			int timeSlowest = Integer.parseInt(line.split(" ")[1]);
			int i = 2;
			
			while (true) {
				if ((timeSlowest * i - timeFastest * i) - timeSlowest >= 0) {
					break;
				}
				i++;
			}
			
			System.out.println(i);
		}
	}
	
}
