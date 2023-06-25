package pattern;

public class pattern1 {

	public static void main(String[] args)
	{
			for (int i = 1; i < 5; i++)
			{
				//  i=1  1<=5t
			//  i=2  2<=5t
			//  i=3  3<=5t
			//  i=4  4<=5t
			//  i=5  5<=5t
				for (int j = 1; j <= i; j++) 
				{
					System.out.print("* ");
				}
				System.out.println();
			}
	}

}
//* 
//* * 
//* * * 
//* * * * 