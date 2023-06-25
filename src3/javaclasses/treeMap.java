package javaclasses;

import java.util.Map.Entry;
import java.util.TreeMap;

public class treeMap {
public static void main(String[] args) {
	TreeMap<Integer,Object> map = new TreeMap<>();
	map.put(10, null);
	//map.put(null,"hi");
	map.put(5, null);
	map.put(7,"hello");
	map.put(10, 20);
	map.put(10, "bye");
	map.put(15, 20);
	
	for(Entry<Integer, Object> m:map.entrySet())
	{
		System.out.println(m.getKey() +" "+ m.getValue());
	}
}
}
