package vocabulary.cli;

import java.util.Scanner;

import vocabulary.core.Vocabulary;
import vocabulary.smaples.Samples;

public class VoCL {

	public static void main(String[] args) {

		System.out.println("start");

		Vocabulary voc = 
				Vocabulary.builder()
				.setData(Samples.data)
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

}
