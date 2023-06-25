package javaclasses;

import java.util.TreeSet;

public class treeSet {
public static void main(String[] args) {
	TreeSet<Object> set = new TreeSet<>();
	set.add(10);
	set.add(5);
	set.add(6);
	set.add(50);
	set.add(40);
	//set.add(null);  //null is not allowed(NullPointerException)
	//set.add("hi");  //heterogenous type of data is not allowed 
	System.out.println(set);
	System.out.println(set.descendingSet()); //print elements in descending order
}
}
