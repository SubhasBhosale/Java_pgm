package interview_quetions;

import java.util.TreeSet;

public class practice 
{
	public static void main(String[] args) 
	{
		String s="subhas";
		TreeSet tree = new TreeSet();
		for (int i = 0; i < s.length(); i++)
		{
			tree.add(s.charAt(i));
		}

		System.out.println(tree);
		int count=0;

		for (Object set : tree)
		{
			if(count<4)
			{
				System.out.println(set+" "+count);
				count++;
			}
		}











	}
}
