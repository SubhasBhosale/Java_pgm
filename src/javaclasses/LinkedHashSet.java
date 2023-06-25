package javaclasses;

public class LinkedHashSet {

	public static void main(String[] args) {
		java.util.LinkedHashSet<Object> set = new java.util.LinkedHashSet<>();
		set.add(10);
		set.add("hi");
		set.add("hi");
		set.add(50);
		set.add(null); //only one null is allowed
		System.out.println(set);
		
		java.util.ArrayList<Object> list = new java.util.ArrayList<>(set);
		list.add(60);
		list.add(80);
		list.add("welcome");
		list.add(null);
		list.add(null);
		list.add(80);
		System.out.println(list);
		java.util.TreeSet<Object> tset = new java.util.TreeSet<>();
		tset.add(10);
		tset.add(5);
		tset.add(6);
		tset.add(50);
		tset.add(10);
		//tset.add(null);  //null is not allowed (NullPointerException)
		tset.add("hello"); //heterogeneous data is not allowed (ClassCastException)
		System.out.println(tset);//auto sorted in ascending order 
		System.out.println(tset.descendingSet());  //print elements in ascending order 
	}

}
