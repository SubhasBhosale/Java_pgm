package Interview_Program;

import java.util.HashMap;

public class NoOfOccuranceInChar 
{
	public static void main(String[] args) 
	{
		String b="aabbcdd";
		char[] a=b.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for (char s : a) 
		{
			if (map.containsKey(s)) 
			{
				map.put(s , map.get(s)+1);
			} else 
			{
				map.put(s, 1);
			}
		}
		System.out.println(map);
	}
}

/*

for(int i=0;i<a.length;i++) 
		{
		    if(map.containsKey(a[i]))
		    {
		       map.put(a[i],map.get(a[i])+1);
		    }
		    else
		    {
		       map.put(a[i],1);
		    }
		}

*/