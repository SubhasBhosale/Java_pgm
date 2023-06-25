package assignment1;

public class mock_4
{
	public static void main(String[] args) {
		String s1="a11b22c33";
		int a=0;
		for (int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				a=a+s1.charAt(i)-48;
			}
		}
		System.out.println(a);
	}

}
