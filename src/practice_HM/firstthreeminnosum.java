package practice_HM;
import java.util.HashSet;

public class firstthreeminnosum {          //sum 1st 3 min no without using array
	public static void main(String[] args) {
		int[] arr= {5,1,0,3,2,6};
		int[] abb=new int[arr.length];
		
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) 
		{
			set.add(arr[i]);

		}
		int sum=0;
		int i=0;
		for (Integer s : set) 
		{
			System.out.print(s+" ");
			if(i<3)
			{
				sum=sum+s;
				i++;
			}
		}
		System.out.println();
		System.out.println("first 3 min no sum ==>> "+sum);
	}
}
