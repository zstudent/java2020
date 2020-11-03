package vocabulary.cli;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import vocabulary.core.Vocabulary;
import vocabulary.core.WordPair;

public class VoCL {

	public static void main(String[] args) {

		System.out.println("start");

		Vocabulary voc = 
				Vocabulary.builder()
				.setData(data)
				.build();

		try (Scanner scanner = new Scanner(System.in) ) {
			while (scanner.hasNextLine()) {
				String word = scanner.nextLine();
				System.out.println(voc.translate(word));
				System.out.println(voc.describe(word));
				System.out.println(voc.synonims(word));
				System.out.println();
			}
		}

	}


	static List<WordPair> data = Arrays.asList(
			WordPair.of("friend", "მეგობარი"),
			WordPair.of("friend", "friend: someone who is very fond to you"),
			WordPair.of("friend", "buddy")
			); 

}
