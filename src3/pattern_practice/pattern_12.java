package pattern_practice;

public class pattern_12 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 6; i++)
		{
			char a='A';
			for (int j = 1; j <= i ; j++) {
				System.out.print(a+++" ");
			}
			System.out.println();
		}
	}
}
//A 
//A B 
//A B C 
//A B C D 
//A B C D E