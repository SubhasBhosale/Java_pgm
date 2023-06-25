package Primeno;
public class Primeno1to40 
{
	public static void main(String[] args) 
	{
		int count1=1;
		for (int i = 1; i <= 40; i=i+1)      //to print from 1 to 40
		{
			int count=0;
			for (int j = 1; j <= i; j++)   //it will iterate from 1 to that no which is given by 1st for loop
			{
				if(i%j==0)
				count++;
			}
			if (count==2)          //if it ensure the prime no condition 
			{
				if(count1%2==1)         
				{System.out.print(i+" ");}
				count1++;                //then we are increasing value of count++
			}
		}
	}
}
//2 5 11 17 23 31 
//3 7 13 19 29 37 ===>> if(count1%2==0) 