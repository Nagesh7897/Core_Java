package map;

import java.util.HashMap;
import java.util.Map;

public class MapToMapTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map=new HashMap<>();
		Map<Integer, String> maptransfered=new HashMap<>();
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "C");
		map.put(4, "Spring");
		map.put(5, null);
		
		maptransfered.putAll(map);
		
		/*
		 * for(Map.Entry entry: map.entrySet()) // For Each Simple method { int a= (int)
		 * entry.getKey(); String b= (String) entry.getValue(); maptransfered.put(a, b);
		 * }
		 */
		for(Map.Entry entry1: maptransfered.entrySet()) {
			System.out.println(entry1.getKey() + "  "+ entry1.getValue());
		}
		
	}

}
