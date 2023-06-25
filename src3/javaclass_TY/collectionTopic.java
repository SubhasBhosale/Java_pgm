package javaclass_TY;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class collectionTopic {
	public static void main(String[] args) {
	
		ArrayList<Object> list = new ArrayList<>();
		list.add(0);
		list.add("hi");
		list.add("hi");
		list.add("10");
		list.add(null);
		list.add(null);

		System.out.println(list);
		ArrayList<Object> list1 = new ArrayList<>();
		list1.add(50);
		list1.add(20);
		list1.add(5);
		list1.add(60);
		System.out.println(list1);
		list.addAll(list1);

		if(list.contains("hi"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		list.remove(4); //reomve the elemetn at index 4
		for(Object alldata:list) //used to fetch all the elements 1 by 1 
		{
			System.out.println(alldata);
		}
		Iterator<Object> it = list.iterator();
		while(it.hasNext()==true)    //hasnext is the boolean type it only check if the data is present or not
		{
			Object alldata1 = it.next();
			System.out.println(alldata1);
		}
		System.out.println(list.get(5));
		System.out.println(list.size());
		System.out.println(list.indexOf("hi"));
		
	/*	PriorityQueue<Integer> Q = new PriorityQueue<>();
		Q.add(10);
		Q.add(10);
		Q.add(30);
		Q.add(40);
		System.out.println(Q.peek());
		System.out.println(Q);
		System.out.println(Q.poll());
		System.out.println(Q);*/
	}
}
