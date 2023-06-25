package javaclasses;

public class Hashtable {

	public static void main(String[] args) {
		java.util.Hashtable<Integer,String> map = new java.util.Hashtable<>();
		map.put(10, "hi");
		map.put(30, "bye");
		map.put(40, "hi");
		map.put(50, "hi"); //duplicate values are allowed
		map.put(30, "welcome");//dupliacate keys are not allowed
		//if dupliacte keys are there it will print the last value
		System.out.println(map);
	}

}
