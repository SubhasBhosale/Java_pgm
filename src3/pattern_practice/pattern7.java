package pattern_practice;

public class pattern7 {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++)
		{
			for (int j = i; j < 5; j++) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}


//o/p==>>
//  1 
// 2 2 
//3 3 3 
//4 4 4 4 