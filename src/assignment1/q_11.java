package assignment1;

public class q_11 {

	public static void main(String[] args) 
	{
		String a = "my name is ok";       //o/p => ko si eman ym
		String[] b = a.split(" "); 		//it will be exactly like this ==>> String[] b = {"my","name","is","ok"};

		String temp=b[0];
		b[0]=b[b.length-1];
		b[b.length-1]=temp;
		
		String temp1 =b[1];
		b[1]=b[b.length-2];
		b[b.length-2]=temp1;
		
		for (int i = 0; i < b.length; i++)
		{
			String p = b[i];
			for (int j = p.length()-1; j >= 0 ; j--) 
			{
				System.out.print(p.charAt(j));
			}
			System.out.print(" ");
		}
	


//ym eman si ko 
}}