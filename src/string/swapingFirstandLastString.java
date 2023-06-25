package string;

public class swapingFirstandLastString 
{
public static void main(String[] args) 
{
	String str="I am from Bangalore";
	String[] s = str.split(" ");
	//s[0]=I s[1]=am s[2]=from s[3]=Bangalore
	String temp=s[0];
	s[0]=s[s.length-1];
	s[s.length-1]=temp;
	for (int i = 0; i < s.length; i++) 
	{
		System.out.print(s[i]+" ");
	}



}
}
