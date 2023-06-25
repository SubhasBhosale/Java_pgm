package assignment1;

public class q_2 {

	public static void main(String[] args) {
		int[] a= {7,-3,0,2,1,-9};
		int fis_max=0;		int sec_max=0;		int third_max=0;    
		for (int i = 0; i < a.length; i++) 
		{
			if(fis_max<a[i])
			{
				third_max=sec_max;
				sec_max=fis_max;
				fis_max=a[i];
			}
			else if(sec_max<a[i])
			{
				third_max=sec_max;
				sec_max=a[i];
			}
			else if(third_max<a[i])
			{
				third_max=a[i];
			}
		}
		System.out.println(fis_max);
		System.out.println(sec_max);
		System.out.println(third_max);
		System.out.println("sum of first 3 max no ==>> "+(fis_max+sec_max+third_max));
	}

}
//if(sec_max<a[i])