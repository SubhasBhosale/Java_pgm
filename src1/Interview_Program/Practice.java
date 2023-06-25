package Interview_Program;

import java.util.HashMap;

public class Practice 
{
	public static void main(String[] args) 
	{
		String a="aabaccdb e";
		String c = a.replace(" ", "");
		char[] b=c.toCharArray();

		HashMap<Character,Integer> map=new HashMap<Character,Integer>();

		for(Character s:b)
		{
		    if(map.containsKey(s))
		    {
		     map.put(s,map.get(s)+1);
		    }
		    else
		    {
		     map.put(s,1);
		    }
		}
		System.out.print(map);
	}
}