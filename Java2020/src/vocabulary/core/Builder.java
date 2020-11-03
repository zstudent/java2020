package vocabulary.core;

import java.util.List;

import vocabulary.core.Vocabulary.VocabularyBuilder;

final class Builder implements VocabularyBuilder {
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