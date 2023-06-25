package interview_quetions;

import java.util.HashSet;

public class SONY_2 {

	public static void main(String[] args) {
		int[] a ={2,3,7};
		HashSet<Integer> set = new HashSet<Integer>();
		for (int j = 0; j < a.length; j++) 
		{
			set.add(a[j]);
		}
		int count=1;
		while(count<=10)
		{
			if(!(set.contains(count)))
			{
				System.out.print(count+" ");
			}
			count++;
		}
	}

}
//O/p : 1 4 5 6 8 9 10