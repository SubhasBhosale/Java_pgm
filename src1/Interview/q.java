package Interview;

public class q 
{
	public static boolean isIdentical(int no)
	{
		if (no<10) {
			return false;
		}
		int temp1=no;
		int a=0;
		while(temp1>0)
		{
			int	b=temp1%10;
			a=a*10+b;
			temp1=temp1/10;	
		}	
		if (a==no)
		{
			return true;
		}
		return false;
	}
	public static void getIdenticalNo(int n)
	{
		for (int i = 1; i <= n; i++) 
		{
			if (isIdentical(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		getIdenticalNo(100);
	}
}
