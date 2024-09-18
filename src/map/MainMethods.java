package map;

import java.util.HashMap;
import java.util.Map;

public class MainMethods {

	public static void main(String[] args) {
//		compute();
//		putIfAbsent();
		getOrDefault();
		
	}

	private static void getOrDefault() {
		Map<Integer, Integer> map = new HashMap<>();
		
		int result = map.getOrDefault(1, -1);
		System.out.println(result);
		
		map.put(1, 1000);
		result = map.getOrDefault(1, -1);
		System.out.println(result);
	}

	private static void putIfAbsent() {
		Map<Character, Integer> map = new HashMap<>();
		char key = 'D';
		
		map.putIfAbsent(key, 4);
		System.out.println(map.get(key));
		
		map.putIfAbsent(key, 5);
		System.out.println(map.get(key));
	}

	private static void compute() {
		Map<Integer, Integer> map = new HashMap<>();
		
		
		map.compute(1, (key, value) -> value==null?1:value+1);
		map.compute(2, (key, value) -> value==null?1:value+1);
		map.compute(3, (key, value) -> value==null?1:value+1);
		map.compute(3, (key, value) -> value==null?1:value+1);
		map.compute(3, (key, value) -> value==null?1:value+1);

		for(Map.Entry<Integer,Integer> entry: map.entrySet()) 
			System.out.println(entry.getKey() + " " + entry.getValue());
	}
	
}
