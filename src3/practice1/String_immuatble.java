package practice1;

import java.util.ArrayList;

public class String_immuatble 
{
	public static void main(String[] args) 
	{
		String name="John";
		String anotherName = "John";
		
		String thirdName=new String("John");
		
		System.out.println(name==thirdName);
	}
}
