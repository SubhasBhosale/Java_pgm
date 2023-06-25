package practice_java;

public class FirstMinNoInArray {

	public static void main(String[] args) {
		int []a= {7,2,3,1,9,5};
		int b=a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (b>a[i])
			{
				b=a[i];
			}
		}
		System.out.println(b);
	}

}
