package Array;

public class String_Array_no_of_vowels 
{
	public static void main(String []args)
	{
	String[] a= {"root","subhas","james"};
	
	for(int i=0;i<a.length;i++)
	{
		String b = a[i];    //root
		int count=0;
		for (int j = 0; j < b.length(); j++)
		{
			if (b.charAt(j)=='a' ||b.charAt(j)=='e' ||b.charAt(j)=='i' ||b.charAt(j)=='o' ||b.charAt(j)=='u')
			{
				count++;
			}
		}
		System.out.println(b+" have vowels "+count);
	}
}
}