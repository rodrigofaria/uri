package br.com.rodrigoluisfaria.chalanges;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem2667 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BigInteger x1 = scanner.nextBigInteger();
		
		BigInteger[] result = x1.divideAndRemainder(new BigInteger("3"));
		
		System.out.println(result[1]);
		scanner.close();
	}
	
}
