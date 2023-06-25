package interview_quetions;

import java.util.LinkedHashSet;

public class SONY_9 
{
	public static void main(String[] args) 
	{
		String a="aaabbcde";
		boolean[] flag= new boolean[a.length()];
		for (int i = 0; i < a.length(); i++) 
		{
			for (int j = i+1; j < a.length(); j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					flag[i]=true;
				}
			}
		}

	}
}















//LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//for (int i = 0; i < a.length(); i++)
//{
//	set.add(a.charAt(i));
//}
//
//for (Character s : set)
//{
//	int count=0;
//	for (int i = 0; i < a.length(); i++)
//	{
//		if(s==a.charAt(i))
//		{
//			count++;
//		}
//	}
//	System.out.println(count);
//	if (count==1)
//	{
//		System.out.println(s);
//		break;
//	}
//
//}