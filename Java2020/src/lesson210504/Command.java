package lesson210504;

import java.io.Serializable;

@SuppressWarnings("serial")
abstract public class Command implements Serializable {
	
	public static class Save extends Command {
//		private Save() {}
	} 
	public static class Load extends Command  {
//		private Load() {}
	} 
	public static class Search extends Command  {
//		private Search() {}
	}
	
//	public static Save save() {  // factory method 
//		return new Save();
//	}
//	
//	public static Load load() {
//		return new Load();
//	}
//
//	public static Search search() {
//		return new Search();
//	}
	
}
