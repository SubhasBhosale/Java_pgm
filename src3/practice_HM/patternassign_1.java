package practice_HM;

public class patternassign_1 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++)  //row
		{
			/*for (int j = i; j <6; j++) //column
			{
				System.out.print(" ");
			}*/
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
/*for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}*/