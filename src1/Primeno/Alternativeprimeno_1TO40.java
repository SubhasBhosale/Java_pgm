package Primeno;

public class Alternativeprimeno_1TO40
{
	public static void main(String[] args) 
	{
		int count1=1;
		for (int i = 1; i <= 40; i++) 
		{
			int count=0;
			for (int j = 1; j <= i; j++)
			{
				if (i%j==0)
				{
					count++;
				}
			}
			if (count==2) //if prime no is there then make it as true
			{
				count1++;
				//flag=true;
			}
			if (count1%2==0) //to count alternative no 
			{
				if (count==2 )  //to print prime no
				{
					System.out.print(i+" ");
				}
			}
		}}}

//2 5 11 17 23 31

















/*

for (int i = 1; i <= 10; i++) 
{int count=0;
	for (int j = 1; j <= i; j++) 
	{
		if (j%i==0)
		{
			count++;
		}
	}
	if (count==2) 
	{
		System.out.println(i);
	}
}
 */