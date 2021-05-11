package lesson210511;

public interface Processor {
	
	void process(Command.Load cmd);
	void process(Command.Save cmd);
	void process(Command.Search cmd);

}
