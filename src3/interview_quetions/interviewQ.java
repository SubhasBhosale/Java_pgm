package interview_quetions;

public class interviewQ 
{
	public static void main(String[] args) 
	{
		String s="a3b2c3a1b1c1";         //aaabbcccabc
		for (int i = 0; i < s.length(); i++) 
		{
			int count=0;
			if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				 int z = s.charAt(i)-48;
				while(count<z)
				{
					System.out.print(s.charAt(i-1));
					count++;
				}
			}
		}
	}
}
