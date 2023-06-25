package assignment1;

import java.util.Iterator;

public class q_3 {

	public static void main(String[] args) {
		/*String a="i am selenium";  		//o/p ==>> m ui nelesmai
		String c = a.replace(" ", "");
		char[] b = c.toCharArray();

		int count=0;
		for (int i = b.length-1; i >= 0; i--) 
		{
			if(count<2)
			{
				System.out.print(b[i]+" ");
				count++;
			}
			else
			{
				System.out.print(b[i]);
			}
		}*/


		// ***Expected : i am selenium => m ui nelesmai
		// ***Actual : i am selenium => m ui nelesma
		String s = "i am selenium";
		String rev = "";
		for (int i = s.length() - 1, j = 0; i >= 0 && j < s.length(); i--, j++) 
		{
			if (s.charAt(j) == ' ') 
			{
				rev += ' ';
				rev += s.charAt(i);
				j++;
			} else if (s.charAt(i) != ' ')
				rev += s.charAt(i);
		}
		System.out.println(rev);
	}
}
// m u inelesmai










