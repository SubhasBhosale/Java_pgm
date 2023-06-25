package practice_HM;

public class noOfUpperAndLowercase {

	public static void main(String[] args) 
	{
		String b="TestYantra";
		char[] a = b.toCharArray();
		int up_case=0;     int low_case=0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>='a' && a[i]<='z') 
			{
				low_case++;
			}
		}
		System.out.println(low_case);
	}

}
