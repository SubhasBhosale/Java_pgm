package practice_java;
public class ReverseWithoutChangingSpace 
{
	public static void main(String[] args) 
	{
		String b="i am selenium";
		char[] a = b.toCharArray();
		int start=0;
		int end=a.length-1;
		for (int i = 0; i < a.length; i++)
		{
			if (a[start]>='a' && a[start]<='z')
			{
				if (a[end]>='a' && a[end]<='z') 
				{
					if (start<end)
					{
						char temp=a[start];
						a[start]=a[end];
						a[end]=temp;
						start++;
						end--;
					}
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
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);
		}
	}
}