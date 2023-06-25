package Primeno;

public class Prime_no {
 public static void main(String[] args)
 {
	 int no=40;
	 int count1=0;
	for (int i = 0; i <= no ; i++) 
	{
	int	count=0;
		for (int j = 1; j <= i; j++) 
		{
			if (i%j==0) 
			{
				count++;
			}
		}
		if (count==2) 
		{
			count1++;
			if (count1%2==1) 
			{
				System.out.println(i);
			}
		}
	}
}
}
