package trackmind;

public class ReverseString_unchange_space_position 
{
	public static void main(String[] args) 
	{
		String b="Hi this is Testyantra";             // o/p => ar tnay ts etsisihtiH
		char[] a = b.toCharArray();

		int start=0;
		int end=a.length-1;

		for (int i = 0; i < a.length; i++) 
		{
			if (start<end) 
			{
				if (a[start]>='a' && a[start]<='z' || a[start]>='A' && a[start]<='Z') 
				{
					if (a[end]>='a' && a[end]<='z' || a[end]>='A' && a[end]<='Z') 
					{
						char temp=a[start];
						a[start]=a[end];
						a[end]=temp;
						
						end--;
						start++;
					}
					else
					{
						end--;
					}
				}
				else
				{
					start++;
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);
		}
	}
}