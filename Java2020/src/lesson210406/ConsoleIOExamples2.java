package lesson210406;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleIOExamples2 {
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		System.out.println("start");
		
		File file = new File("/Users/zaal/git/java2020/Java2020/src/lesson210406/ConsoleIOExamples2.java");
		System.out.println(file.exists());
		
		System.setIn(new FileInputStream(file));
		
		File out = new File("tmp2.txt");
		
		System.out.println(out.getAbsolutePath());
		
		System.out.println(out.exists());
		
		System.setOut(new PrintStream(out));
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
			System.out.flush();
		}
		
		Thread.sleep(60000);
		
	}

}
