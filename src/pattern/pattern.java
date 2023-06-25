package pattern;

public class pattern {

	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i <=n; i++)
		//       i=1     i<=5 true
		{
			for (int j = 0; j <=n; j++)
			//        j=1   1<=5 true            //it will repeat for every i=1,2,3,4,5
//		        j=2   2<=5 true
//		        j=3   3<=5 true
//		        j=4   4<=5 true
//		        j=5   5<=5 true
//		        j=6   6<=6 false 	
			{
				
				System.out.print("* ");
			}
			System.out.println();
			}
	}

}

//* * * * * * 
//* * * * * * 
//* * * * * * 
//* * * * * * 
//* * * * * * 
//* * * * * * 
