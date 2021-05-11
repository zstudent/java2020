package lesson210511;

public class App {
	
	public static void main(String[] args) {
		RealProcessor rp = new RealProcessor();
		
		rp.accept(new Command.Load());
		rp.accept(new Command.Save());
		rp.accept(new Command.Search());
	}

}
