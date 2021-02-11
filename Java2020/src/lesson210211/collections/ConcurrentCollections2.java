package lesson210211.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollections2 {
	
	public static void main(String[] args) {
		
//		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		
		map.put("one", "1");
		map.put("two", "2");
		
		for (String key : map.keySet()) {
			System.out.println(key);
			if (key.startsWith("o")) map.remove(key);
		}
		
		System.out.println(map);
	}

}
