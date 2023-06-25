package factorial;

public class factorial_while_loop_1 {
	public static void main(String[] args) 
	{
		int a=6;
		int count=0;
		int mul=1;
		while (count<a) 
		{
			count++;
			mul=mul*count;
		
		}
		System.out.println(mul);
	}
}
