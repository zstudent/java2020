package lesson210122;

import java.util.Set;

public class Construction {

}

class Dictionary<K,V> {  // Map, Associative Array
	public void put(K key, V value) {}
	public V get(K key) {return null;}
}

class SymbolTable extends Dictionary<String, String> {
	Set<String> subset(String from, String to) {
		super.get(from);
		return  null;
	}
	
	@Override
	public String get(String key) {
		throw new UnsupportedOperationException();
	}
}
