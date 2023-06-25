package practice_HM;

public class stringclasses {
public static void main(String[] args) {
	String a="I am am from i testYantra";
	String[] b=a.split(" ");
	int count=0;
	for (int i = 0; i < b.length; i++)
	{
		if (a.contains(b.toString())) 
		{
			count++;
		}
	}
	System.out.println(count);
}
}
