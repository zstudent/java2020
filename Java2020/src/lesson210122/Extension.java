package lesson210122;

public class Extension {

}

class BetterDictionary<K,V> extends Dictionary<K,V> {
	boolean contains(K key) {
		return false;
	}
}