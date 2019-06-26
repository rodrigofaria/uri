package br.com.rodrigoluisfaria.chalanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem2855 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		while(in.ready()) {
			String str = in.readLine();
			int numberOfNumbers = Integer.parseInt(str);
			
			List<Integer> numbers = new ArrayList<Integer>(numberOfNumbers + 1);
			numbers.add(-1);//just to put something in the position "0"
			
			str = in.readLine();
			String[] line = str.split(" ");
			for (int i = 0; i < line.length; i++) {
				numbers.add(Integer.parseInt(line[i]));
			}
			
			str = in.readLine();
			int magicNumber = Integer.parseInt(str);
			String result = "";
			int position = numbers.indexOf(magicNumber);
			int starts = 2;
			
			while (true) {

				if (position < starts) {
					result = "Y";
					break;
				}
				
				if (position % starts == 0) {
					result = "N";
					break;
				} else {
					position = position - (position / starts);
					starts++;
				}
			}
			
			System.out.println(result);
		}
	}
    
}
