package lesson201222;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import lesson201221.Person;

public class Maps {
	
	public static void main(String[] args) {
		Map<String, Person> hashMap = new HashMap<>(); 
		Map<String, Person> treeMap = new TreeMap<>(); 
		Map<String, Person> linkedHashMap = new LinkedHashMap<>();
		
		process(hashMap);
		process(treeMap);
		process(linkedHashMap);
	}

	private static void process(Map<String, Person> map) {
		map.put("Pete", new Person("Pete", 30));
		map.put("Ann", new Person("Ann", 40));
		map.put("John", new Person("John", 14));
		map.put("Mike", new Person("Mike", 25));
		map.put("Brian", new Person("Brian", 18));
		System.out.println(map);
	}

}
