package pattern_practice;

public class pattern_13
{
	public static void main(String[] args) 
	{
		char a='A';
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print(a+++" ");
			}
			System.out.println();
		}
	}

}
//A 
//B C 
//D E F 
//G H I J 
//K L M N O 
