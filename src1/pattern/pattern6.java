package pattern;

public class pattern6 {
public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <= n; i++) 
	{
		for (int j = i; j < n; j++) 
			//when j=i(in the initialization) we get below pattern 
			//* * * * 
			//* * * 
			//* * 
			//* 
			//but here we gave space( ) in the place of *
		{
			System.out.print(" ");  //decreasing space
		}
		for (int j = 1; j <= i; j++) 
			//when we put j<=i (in condn) it will give below pattern
  //	        * 
  //	      * * 
  //	    * * * 
  //      * * * * 
 //     * * * * *			
			//but along with * we are giving space( ) each time it will get incremented along with * 
		{
			System.out.print("* ");  //increasing space
		}
		//it is giving pyramid shape bcz we along with * , space( ) is also added  
		System.out.println();
	}
}
}
// o/p=>
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
