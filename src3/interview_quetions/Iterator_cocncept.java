package interview_quetions;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_cocncept 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Allen");
		list.add("suresh");
		list.add("manoj");
		list.add("henry");
		list.add("moras");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())    //boolean   //It returns true if the iterator has more elements otherwise it returns false.
		{
			System.out.println(iterator.hasNext());
			String a = iterator.next();	  //Object   	//It returns the element and moves the cursor pointer to the next element.
			System.out.println(a);
		}
	}
}
