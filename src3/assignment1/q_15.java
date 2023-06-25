package assignment1;

public class q_15 {

	public static void main(String[] args) 
	{
		String a="hello";
		char[] b = a.toCharArray();
		int count=0;
		for (char c : b)
		{
			count++;
		}
		System.out.println(count);
	}

}
