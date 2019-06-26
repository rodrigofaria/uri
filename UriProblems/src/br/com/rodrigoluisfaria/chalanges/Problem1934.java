package br.com.rodrigoluisfaria.chalanges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem1934 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		while (in.ready()) {

			String line = in.readLine();
			if (line.isEmpty()) {
				continue;
			}
			String[] firstLine = line.split(" ");
			int lines = Integer.parseInt(firstLine[0]);
			int columns = Integer.parseInt(firstLine[1]);

			List<String> linesFull = new ArrayList<>();

			for (int i = 0; i < lines; i++) {
				line = in.readLine();
				linesFull.add(line);
			}

			line = in.readLine();
			String[] pieces = line.split(" ");

			for (int j = 0; j < columns; j++) {
				String lineVertical = "";
				for (int i = 0; i < lines; i++) {
					String lineHorizontal = linesFull.get(i);
					lineVertical += lineHorizontal.split(" ")[j] + " ";
				}
				lineVertical += pieces[j];
				linesFull.add(lineVertical);
			}

			Map<String, String> words = new HashMap<>();
			int counter = -1;

			while (counter < words.size()) {
				for (int i = 0; i < linesFull.size(); i++) {
					pieces = linesFull.get(i).split(" ");
					if (pieces.length < 2) {
						continue;
					}

					String lastWord = pieces[0];
					if (words.get(lastWord) != null && !words.get(lastWord).isEmpty()) {
						continue;
					}
					
					boolean allEquals = true;

					for (int j = 0; j < pieces.length - 1; j++) {
						String word = pieces[j];
						if (!words.containsKey(word)) {
							words.put(word, "");
						}

						if (!word.equals(lastWord)) {
							allEquals = false;
						}
					}

					if (allEquals) {
						int val = Integer.parseInt(pieces[pieces.length - 1]) / (pieces.length - 1);
						
						words.put(lastWord, val + "");
						if (counter == -1) {
							counter = 1;
						} else {
							counter++;
						}
					}
				}

				for (String wordsKey : words.keySet()) {
					String value = words.get(wordsKey);

					if (!value.isEmpty()) {
						for (int i = 0; i < linesFull.size(); i++) {
							line = linesFull.get(i);

							if (line.contains(wordsKey)) {

								pieces = line.split(" ");
								int counterWordsMatch = 0;
								for (int k = 0; k < pieces.length - 1; k++) {
									if (pieces[k].equals(wordsKey)) {
										counterWordsMatch++;
									}
								}

								int intValue = Integer.parseInt(value);
								int totalInThisLine = intValue * counterWordsMatch;
								int newValue = Integer.parseInt(pieces[pieces.length - 1]) - totalInThisLine;
								line = line.replaceAll("-?[0-9].*", "");
								line = line.replaceAll(wordsKey + " ", "");
								line += newValue;
								linesFull.set(i, line);
							}
						}
					}
				}
			}

			Map<String, String> sortedMap = new TreeMap<>(words);
			for (String key : sortedMap.keySet()) {
				System.out.println(key + " " + sortedMap.get(key));
			}
		}
	}

}
