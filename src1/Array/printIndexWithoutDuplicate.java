package Array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class printIndexWithoutDuplicate {

	public static void main(String[] args) {
		int[] a= {2,4,4,6,5,6};     						//  o/p==>> 2=1 4=2 6=4 5=5

		TreeSet<Object> set = new TreeSet<Object>();
		for (int i = 0; i < a.length; i++)
		{
		//	System.out.println(set.add(a[i])==true);
			if(set.add(a[i])==true)
			{
			
				System.out.print(a[i]+"="+(i+1)+" ");
			}
		}
	}
}

//2 ===>>> 1 position
//4 ===>>> 2 position
//6 ===>>> 4 position
//5 ===>>> 5 position
