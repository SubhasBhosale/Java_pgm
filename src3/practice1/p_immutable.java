package practice1;

public class p_immutable {

	public static void main(String[] args) 
	{
		// Java Program to demonstrate why
		// Java Strings are immutable
		{
			String s1 = "java";
			String s2 = s1.concat(" rules");

			// Yes, s1 still refers to "java"
			System.out.println("s1 => " + s1);
			System.out.println("s2 => "+s2);
		}
	}
}


