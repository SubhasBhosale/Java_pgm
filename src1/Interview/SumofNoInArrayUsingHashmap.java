package Interview;

import java.util.HashMap;

public class SumofNoInArrayUsingHashmap 
{
	public static void main(String[] args) 
	{
		int[] a= {10,5,8,7,8,9,6,1,14,3,12};

		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]+a[j]==15) 
				{
					if (map.containsKey(a[j])==false)
					{
						if (map.containsValue(a[j])==false) //important bcz by giving false it remove duplicates
						{
							map.put(a[i],a[j]);
						}
					}
				}
			}
		}
		System.out.print(map);
	}
}