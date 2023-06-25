package Array;

public class First_sec_thirdMAX
{
	public static void main(String[] args) {
		int[] a= {0,7,8,10,8,11,9,6,9,11,10};
		int b=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (b<a[i])
			{
				b=a[i];
			}
		}
		System.out.println(b);
		
		int c=0;
		for (int i = 0; i < a.length; i++) 
		{
			if (c<a[i] && b!=a[i])
			{
				c=a[i];
			}
		}
		System.out.println(c);
		int d=0;
		for (int i = 0; i < a.length; i++) {
			if (d<a[i] && b!=a[i] && c!=a[i]) {
				d=a[i];
			}
		}
		System.out.println(d);
	}
}