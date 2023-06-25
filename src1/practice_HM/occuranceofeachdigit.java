package practice_HM;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class occuranceofeachdigit {          //sum 1st 3 min no without using array
	public static void main(String[] args) 
	{
		int[] arr={6,1,1,4,5,5,2};
		LinkedHashSet<Integer> set = new	LinkedHashSet<>();
				for (int i = 0; i < arr.length; i++) {
					set.add(arr[i]);
				}
	for (Integer dupli : set) {
		int i=0;
		for (int j = 0; j < arr.length; j++) {
			if(dupli==arr[j])
			{
				i++;
			}
		}
		if(i>1)
		{
			System.out.println(dupli +" is repeating for "+(i++)+" times");
		} 
		else
		{
			System.out.println(dupli +" is repeating for "+(i++)+" times");
		}
			
	}
	
	}
}
