package Planeit;

import java.util.HashMap;

public class LinkedHashMap_1 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,1,3,7,8,9,4,5,6,3,2,4,1};
		//int[] a= {10,5,10,10};

		HashMap<Integer,Integer>	map=new HashMap<Integer,Integer>();

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]+a[j]==5) 
				{
					if (map.containsKey(a[i])==false) 
					{
						if(map.containsValue(a[i])==false)
						{
							map.put(a[i], a[j]);
						}
					}
				}
			}
		}
		System.out.println(map);
	}
}
//   {1=4, 2=3, 3=2, 4=1}
