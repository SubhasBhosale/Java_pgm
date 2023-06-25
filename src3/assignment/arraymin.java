package assignment;

import java.util.LinkedHashSet;

public class arraymin {
	public static void main(String[] args) {
		int []arr= {0,7,8,8,10,2,6,9,9,1,1};   
		int fmax=0;
		int smax=0;
		int tmax=0;
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) 
		{
			set.add(arr[i]);
		}
		for (Integer s : set) 
		{
			if(s>fmax)
			{
				tmax=smax;
				smax=fmax;
			    fmax=s;
			}
			 else if(s>smax)
			   {
				 tmax=smax;
				smax=s;
			   }
			 else if(s>tmax)
			 {
				 tmax=s;
			 }
		}
		System.out.println("The 1st max no ==>> "+fmax);
		System.out.println("The 2nd max no ==>> "+smax);
		System.out.println(tmax);
	}
}
