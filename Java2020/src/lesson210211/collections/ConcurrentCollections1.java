package lesson210211.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import utils.Time;

public class ConcurrentCollections1 {
	
	public static void main(String[] args) {
		
//		Map<String, String> map = new ConcurrentHashMap<String, String>();
//		Map<String, String> map = Collections.synchronizedMap(new HashMap<String,String>());
		Map<String, String> map = new Hashtable<String,String>();
		
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		service.execute(() -> {map.put("one", "1");});
		service.execute(() -> {map.put("two", "2");});
		service.execute(() -> {map.put("three", "3");});
		
		Time.pause(1000);
		
		System.out.println(map);
	}

}
