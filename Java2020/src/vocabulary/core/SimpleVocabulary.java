package vocabulary.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class SimpleVocabulary implements Vocabulary {

	Map<String, List<String>> dictionary = new TreeMap<>();
	Map<String, List<String>> thesaurus = new TreeMap<>();
	Map<String, List<String>> synonims = new TreeMap<>();

	public SimpleVocabulary(List<WordPair> words) {
		parse(words);
	}

	private void parse(List<WordPair> words) {
		words.forEach(wp -> {
			if (wp.peer().startsWith(wp.word() + ":")) {
				putInMap(thesaurus, wp);
			} else if (wp.peer().matches("\\w+")) {
				putInMap(synonims, wp);
			} else {
				putInMap(dictionary, wp);
			}
		});
	}

	private void putInMap(Map<String, List<String>> map, WordPair wp) {
		map
		.computeIfAbsent(wp.word(), k -> new ArrayList<>())
		.add(wp.peer());
	}

	@Override
	public List<String> translate(String word) {
		return dictionary.get(word);
	}

	@Override
	public List<String> describe(String word) {
		return thesaurus.get(word);
	}

	@Override
	public List<String> synonims(String word) {
		return synonims.get(word);
	}

}
