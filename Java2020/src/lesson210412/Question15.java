package lesson210412;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question15 {

	private void echo() throws IOException {
		try (FileReader fileReader = new FileReader("zoo-data.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			System.out.println(bufferedReader.readLine());
		}
	}

}
