package lesson210406;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleIOExamples3 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("start");
		
		File file = new File("/Users/zaal/git/java2020/Java2020/src/lesson210406/ConsoleIOExamples2.java");
		Scanner sc = new Scanner(new FileInputStream(file));

		try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("tmp2.txt")))) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				printWriter.println(line);
			}
		}
		
		
		Thread.sleep(60000);
		
	}

}
