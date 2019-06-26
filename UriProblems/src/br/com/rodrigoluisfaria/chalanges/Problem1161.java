package br.com.rodrigoluisfaria.chalanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1161 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
       
        while(in.ready()) {
            String str = in.readLine();
            String[] line = str.split(" ");
            int a1 = Integer.parseInt(line[0]);
            int a2 = Integer.parseInt(line[1]);
            
            long sum = calc_factorial(a1) + calc_factorial(a2);
            System.out.println(sum);
        }

	}
	
	private static long calc_factorial(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * calc_factorial(n - 1);
		}
	}
}
