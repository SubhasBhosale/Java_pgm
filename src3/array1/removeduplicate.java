package array1;

import java.util.LinkedHashSet;

public class removeduplicate {
public static void main(String[] args) {
	int[] arr= {6,2,4,4,6,5,6};
	LinkedHashSet<Integer> set = new LinkedHashSet<>();   
	//remove DUPLICATES //it will follow the order of insertion
	for (int i = 0; i < arr.length; i++) 
	{
		set.add(arr[i]);
	}
	System.out.print(set+" ");
	
}
}
