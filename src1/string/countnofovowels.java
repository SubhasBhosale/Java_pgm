package string;

public class countnofovowels {
public static void main(String[] args) {
	String b="India";
	String c=b.toLowerCase();
	char[] a = c.toCharArray();
	int count=0;
	for (int i = 0; i < a.length; i++)
	{
		
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
		{
			count++;
			System.out.println(a[i]);
		}
	}
	System.out.println("no of vowels "+count);
}
}
