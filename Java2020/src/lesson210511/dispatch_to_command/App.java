package lesson210511.dispatch_to_command;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;

public class App {
	
	private static final Map<String, Supplier<Command>> commands = new HashMap<>();
	
	static {
		commands.put("load", Command.Load::new);
		commands.put("save", Command.Save::new);
		commands.put("search", Command.Search::new);
	}
	
	public static void main(String[] args) {
		RealProcessor rp = new RealProcessor();

		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			String cmd = scanner.nextLine();
			Optional.ofNullable(commands.get(cmd)).ifPresent(s -> {
				s.get().execute(new Data());
			});
		}
	}

}
