package assignment1;

public class q_9 {

	public static void main(String[] args) {
		int[] a = {1,3,5,2,8,9,10};    //sum of no should be 11
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]+a[j]==11)
				{
					System.out.println("that values are ==>> "+a[i]+" "+a[j]);
				}
			}
		}
	}

}
