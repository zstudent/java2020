package vocabulary.core;

public interface WordPair {
	String word();
	String peer();

	static public WordPair of(String word, String peer) { // factory method
		return new WordPair() {
			@Override
			public String word() {
				return word;
			}
			@Override
			public String peer() {
				return peer;
			}
		};
	}

}
