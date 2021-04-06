package lesson210406;

import java.util.Scanner;

public class ConsoleIOExamples {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
	}

}
