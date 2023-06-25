package practice_HM;

import java.util.Iterator;

public class stringbubblesort
{
	public static void main(String[] args) 
	{
		String[] s= {"12","1","53","4","7345234"};   
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp = s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (int k = 0; k < s.length; k++) {
			System.out.println(s[k]);
		}
	}
}
