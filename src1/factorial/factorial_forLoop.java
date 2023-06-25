package factorial;

public class factorial_forLoop 
{
	public static void main(String[] args) 
	{
		int a=6;
		int mul=1;
		for (int i = 1; i <= a; i++)
		{
			mul=mul*i;
		}
		System.out.println(mul);
	}
}
