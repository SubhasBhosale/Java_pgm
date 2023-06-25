package practice_HM;

public class countvowels {
	public static void main(String[] args) {
		String a = "India";
		String b=a.toLowerCase();
		char[] c = b.toCharArray();


		int count=0;		 
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]=='a'||c[i] =='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count++;
			}

		}
		if(count>1)
		{
			System.out.println(count);
		}

	}
}
