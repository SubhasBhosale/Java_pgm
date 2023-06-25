package pattern_practice;
public class pattern_14 {
	public static void main(String[] args) 
	{
		for (int i = 0; i < 5; i++) 
		{
			char a='A'; char b='U';
			if(i<4)
			{
				for (int j = 0; j <= i; j++)
				{
					System.out.print(a+++" ");
				}
			}
			else
			{
				for(int j = 0; j <= i; j++)
				{
					System.out.print(b+++" ");
				}
			}
			System.out.println();
		}
	}
}
//A 
//A B 
//A B C 
//A B C D 
//U V W X Y 