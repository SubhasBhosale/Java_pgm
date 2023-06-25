package practice1;

public class p1 {

	public static void main(String[] args)
	{
		String a = "javaprogramminglanguage";
		String b = "program";

		boolean flag = false;
		for (int i = 0; i <= a.length() - b.length(); i++) 
		{
			if (a.substring(i, i + b.length()).equals(b)) 
			{
				flag = true;
				break;
			}
		}

		if (flag) 
		{
			System.out.println("Substring found");
		} else
		{
			System.out.println("Substring not found");
		}
	}


}


