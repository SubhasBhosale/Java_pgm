package pattern;

public class pattern15 {
public static void main(String[] args) 
{
	for (int i = 1; i <= 5; i++)
	{
		char c='A';   //***********************
		for (int j = 1; j <= i; j++)
		{
			System.out.print(c++ +" ");
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
