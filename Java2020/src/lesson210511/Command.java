package lesson210511;

abstract public class Command {
	
	abstract public void execute(Processor processor);

	public static class Save extends Command {

		@Override
		public void execute(Processor processor) {
			processor.process(this);
		}
	}

	public static class Load extends Command {
		@Override
		public void execute(Processor processor) {
			processor.process(this);
		}
	}

	public static class Search extends Command {
		@Override
		public void execute(Processor processor) {
			processor.process(this);
		}
	}
}
