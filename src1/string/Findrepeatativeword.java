package string;

public class Findrepeatativeword {
	public static void main(String[] args) 
	{
		String z = "a2ship cushion caassh";   
		String[] s = z.split(" ");
		String a="sh";
		int count=0;
		for (int i = 0; i < s.length; i++) 
		{
			String b=s[i];
			for (int j = 0; j < b.length(); j++) 
			{
				String c="";   //it has to be declare with something bcz it is local variable within method ,
															//not gloabl so it will take default value
				for (int k = j; k < b.length(); k++)
				{
					c=c+b.charAt(k);
					if (a.equals(c))
					{
						count++;
						break;
					}		
				}
			}
		}	
		if (count==3)
		{
			System.out.println(a+" ==>> present in all of the words");
		}
		else
		{
			System.out.println("nooooot");	
		}
	}}



/*
cushion
trash
cash
dishes
shape. 
shirt. 
shoe. 
ship

Refer.
Offer.
There.

money
union
phone
stone
 */