package array;
import java.util.LinkedHashSet;
public class removeDupliactesAndCount
{
public static void main(String[] args) 
{
	int[] arr= {2,4,4,6,5,6};
	LinkedHashSet<Integer> set = new LinkedHashSet<>(); //remove duplicates
	for (int i = 0; i < arr.length; i++) 
	{
		set.add(arr[i]);
	}
	for (Integer n : set) 
	{
	    	int count=0;
	    	for (int j = 0; j < arr.length; j++) 
	    	{
				if(n==arr[j])
				{
					count++;
				}
			}   	
	    	if(count>1)
	    	{
	    		System.out.println(n+" is repeating "+count+" time");
	    	}
	//    	System.out.println();
	    	if(count==1)
	    	{
	    		System.out.println(n+" is repeating "+count+" time");
	    	}
	}	
}
}
