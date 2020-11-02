package vocabulary.core;

import java.util.List;

public class Service {

	public interface VocabularyBuilder {
		VocabularyBuilder setData(List<WordPair> words);
		Vocabulary build();
	}

	static public VocabularyBuilder builder() {
		return new Builder();
	}

	static private class Builder implements VocabularyBuilder {

		private List<WordPair> words;

		@Override
		public VocabularyBuilder setData(List<WordPair> words) {
			this.words = words;
			return this;
		}

		@Override
		public Vocabulary build() {
			return new SimpleVocabulary(words);
		}

	}


}
