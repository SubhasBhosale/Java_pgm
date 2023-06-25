package javaclasses;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<Integer,String> map = new java.util.HashMap<>();
		map.put(10, "hi");
		map.put(50, "hello");
		map.put(30, null); //multiple null values are allowed
		map.put(50, null);
		map.put(null, "hello");
		map.put(30, "bye");
		map.put(40, "bye");
		map.put(80, "welcome");
		map.put(20,null);
		for(java.util.Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println(map.containsKey(50));
		System.out.println(map.containsValue("welcome"));
		System.out.println(map.size());
		map.replace(50,"helloji");
		System.out.println(map.remove(80));
		System.out.println(map);
	}

}
