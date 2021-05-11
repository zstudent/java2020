package lesson210511;

import lesson210511.Command.Load;
import lesson210511.Command.Save;
import lesson210511.Command.Search;

public class RealProcessor implements Processor {
	
	public void accept(Command cmd) {
		cmd.execute(this);
	}

	@Override
	public void process(Load cmd) {
		System.out.println(cmd);
	}

	@Override
	public void process(Save cmd) {
		System.out.println(cmd);
	}

	@Override
	public void process(Search cmd) {
		System.out.println(cmd);
	}

}
