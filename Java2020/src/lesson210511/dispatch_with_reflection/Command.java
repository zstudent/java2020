package lesson210511.dispatch_with_reflection;

abstract public class Command {
	
	public static class Save extends Command {
	}

	public static class Load extends Command {
	}

	public static class Search extends Command {
	}
}
