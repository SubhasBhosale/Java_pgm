package string;

public class sumOfNumbersInString {
public static void main(String[] args) {
	String s="1b2c5d";     //o/p =>  8
	
	int sum = 0;
	char[] a = s.toCharArray();
	for (int i = 0; i < a.length; i++)
	{
		if (a[i]>='0'&& a[i]<='9')  //&& both the conditions has to be true
		{
			sum=sum+a[i]-48;       //49-48   //0 -> 48 (ascii value of 0)
		}
	}
	System.out.println(sum);
}
}
