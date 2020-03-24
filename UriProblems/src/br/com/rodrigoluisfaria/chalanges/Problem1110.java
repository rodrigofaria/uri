package br.com.rodrigoluisfaria.chalanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1110 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		while (in.ready()) {

			String line = in.readLine();
			int value = Integer.parseInt(line);
			
			if (value == 0) {
				break;
			}
			
			List<Integer> cards = new ArrayList<>(value);
			List<Integer> discarded = new ArrayList<>();
			
			for (int i = 1; i <= value; i++) {
				cards.add(i);
			}
			
			while (cards.size() > 1) {
				int discart = cards.remove(0);
				discarded.add(discart);
				
				int sendToEnd = cards.remove(0);
				cards.add(sendToEnd);
			}
			
			StringBuffer sb = new StringBuffer();
			
			sb.append("Discarded cards: ");
			for (int i = 0; i < discarded.size(); i++) {
				sb.append(discarded.get(i));
				sb.append(", ");	
			}
			int max = sb.length();
			sb.delete(max - 2, max);
			sb.append("\nRemaining card: ");
			sb.append(cards.get(0));
			
			System.out.println(sb);
		}
	}

}
