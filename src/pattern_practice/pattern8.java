package pattern_practice;

public class pattern8 {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				if(i%2==0)
				{
					System.out.print(2+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
	}

}
//1 
//2 2 
//1 1 1 
//2 2 2 2 
//1 1 1 1 1 