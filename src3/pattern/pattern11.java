package pattern;

public class pattern11 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) 
			{
//						1 
//       				2 2 
//		        		1 1 1 
//				        2 2 2 2 		//when j<=i in the condn	
//						1 1 1 1 1				
				if(i%2==0)  //2%2==0, 4%2==0    //only two times we got the 2 in output
				{
					System.out.print("2 ");
				}
				else               // 1%2==1  , 3%2==1 ,5%2==1 //that's why we got '1',3 times
				{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
