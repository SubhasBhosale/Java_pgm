package javaclasses;

public class ArrayList {
public static void main(String[] args) {
	 java.util.ArrayList<Object> list = new java.util.ArrayList<>();
	list.add(10);
	list.add("hi");
	list.add("hi");
	list.add("10");
	list.add(null);
	list.add(null);

	System.out.println(list);
	java.util.ArrayList<Object> list1 = new java.util.ArrayList<>();
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
	 java.util.Iterator<Object> it = list.iterator();
	while(it.hasNext()==true)    //hasnext is the boolean type it only check if the data is present or not
	{
		Object alldata1 = it.next();
		System.out.println(alldata1);
	}
	System.out.println(list.get(5));
	System.out.println(list.size());
	System.out.println(list.indexOf("hi"));
}
}
