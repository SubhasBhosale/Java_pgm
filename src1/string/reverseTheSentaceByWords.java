package string;

public class reverseTheSentaceByWords {
public static void main(String[] args) 
{
	String s="I am from Bangalore";                  //o/p-->> Bangalore from am I
	String[] st = s.split(" ");
	for (int i = st.length-1; i >=0; i--) 
	{
		System.out.print(st[i]+" ");             
	}
}
}
