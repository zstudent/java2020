package lesson210408;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		Console cons;
		char[] passwd;
		if ((cons = System.console()) == null) {
			System.out.println("no console");
			return;
		}
		if ((passwd = cons.readPassword("[%s]", "Password:")) != null) {
			System.out.println(passwd);
			java.util.Arrays.fill(passwd, ' ');
		}
		
		System.out.println(System.console());
		System.out.println(System.console());
		System.out.println(System.console());
	}

}
