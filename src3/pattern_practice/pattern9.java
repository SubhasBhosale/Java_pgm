package pattern_practice;

public class pattern9 {

	public static void main(String[] args) {
			for (int i = 1; i < 6; i++)
			{
				for (int j = 1; j <= i; j++)
				{
					if(j%2==0)
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
//1 2 
//1 2 1 
//1 2 1 2 
//1 2 1 2 1 