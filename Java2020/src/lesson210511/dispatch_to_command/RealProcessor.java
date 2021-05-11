package lesson210511.dispatch_to_command;

public class RealProcessor {

	public void accept(Command cmd) {
		cmd.execute(new Data());
	}

}
