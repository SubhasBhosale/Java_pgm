package practice_java;

public class multiplicationOfFirstThreeMaxNo {

	public static void main(String[] args) {
		int []a= {7,2,0,1,5};
			
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int b=1;
		for (int k = 0; k <= 2; k++)
		{
			b=b*a[k];
		}
		System.out.println(b);
		System.out.println();
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

}
