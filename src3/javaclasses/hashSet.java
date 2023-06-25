package javaclasses;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
                         HashSet<Object> set = new HashSet<>();
                         set.add(10);
                         set.add("hi");
                         set.add("hi");
                         set.add(null);
                         set.add(50);
                         set.add(null);  //only one null is allowed
                       System.out.println(set);
                         
	}

}
