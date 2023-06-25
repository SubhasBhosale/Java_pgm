package Practice_G4_Array;

import java.util.HashSet;
public class FindElementWithMaxLengthInArray 
{
	public static void main(String[] args) 
	{
		String[] str = {"helloworld","hello","bye","hi","java","worldhello"};
		String s = str[0];
		
		for (int i = 0; i < str.length; i++)
		{
			if (str[i].length()>s.length())
			{
				s=str[i];
			}
		}

		for (int i = 0; i < str.length; i++) 
		{
			if (s.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
	}}




//HashSet<String> Set =new  HashSet<String>();
//for (int i = 0; i < str.length; i++) 
//{
//	for (int j = 0; j < str.length; j++)
//	{
//		if (str[i].length()>str[j].length()) 
//		{
//			String temp=str[i];
//			str[i]=str[j];
//			str[j]=temp;
//		}
//	}
//}	
//System.out.println(str[0]);