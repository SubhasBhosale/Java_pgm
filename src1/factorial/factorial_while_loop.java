package factorial;

public class factorial_while_loop 
{
	public static void main(String[] args) 
	{
		int a=6;
		int count=1;
		int mul=1;
		while (count<=a) 
		{
			mul=mul*count;
			count++;
		}
		System.out.println(mul);
	}
}
