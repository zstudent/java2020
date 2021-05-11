package lesson210511.dispatch_to_command;

abstract public class Command {
	
	abstract public void execute(Data data);

	public static class Save extends Command {

		@Override
		public void execute(Data data) {
			System.out.println(data);
		}
	}

	public static class Load extends Command {

		@Override
		public void execute(Data data) {
			System.out.println(data);
		}
	}

	public static class Search extends Command {

		@Override
		public void execute(Data data) {
			System.out.println(data);
		}
	}
}
