package prakash_SIR;

public class Swap1stAndLastWord 
{
	public static void main(String[] args) 
	{
		String a="today is friday";
		String[] b = a.split(" ");


		for (int i = b.length-1; i >=0; i--)
		{
			System.out.print(b[i]+" ");
		}
	}
}
