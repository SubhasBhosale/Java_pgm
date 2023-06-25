package string;

public class countNoOfVowels 
{
	public static void main(String[] args) 
	{
		String a="India";
		String b = a.toLowerCase();
		int count=0;
		for (int i = 0; i < b.length(); i++) 
		{
			if (b.charAt(i)=='a' || b.charAt(i)=='e'|| b.charAt(i)=='i'|| b.charAt(i)=='o'|| b.charAt(i)=='u')
			{
				System.out.println(b.charAt(i));
				count++;
			}
		}
		System.out.println("=====>>>>>  "+count);
	}

}
