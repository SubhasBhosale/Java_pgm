package pattern;

public class pattern17 {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++)
	{
		char c='A';   //***********************
		char u='U';
		for (int j = 1; j < i; j++)
		{
			if(j<=i)
			{
				System.out.print(c++ +" ");
				
			}
		}
		System.out.println();
		for (int j = 1; j <= i; j++)
		{
	         if(i>4)
	         {
				System.out.print(u++ +" ");
	         }
			
		}
	}
}
}
//A 
//A B 
//A B C 
//A B C D 
//U V W X Y 
//my program