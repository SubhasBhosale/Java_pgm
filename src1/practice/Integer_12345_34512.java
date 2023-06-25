package practice;

public class Integer_12345_34512 
{
	public static void main(String[] args) 
	{
		int a=12345;   // 34512
		int b=0;
		int count=0;
		while(count<2)
		{
			int	c=a%10;
			b=b*10+c;
			a=a/10;	
			count++;
		}
		System.out.print(b+""+a);
	}

}
