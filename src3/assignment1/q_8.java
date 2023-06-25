package assignment1;

public class q_8 {

	public static void main(String[] args) 
	{
		int[] a= {7,-6,11,9,0,4};
		int fis_min=0;  int sec_min=0;   int th_min=0;
		for (int i = 0; i < a.length; i++) 
		{
				if(fis_min>a[i])
				{
					th_min=sec_min;
					sec_min=fis_min;
					fis_min=a[i];
				}
				else if(fis_min==sec_min || sec_min>a[i])
				{
					th_min=sec_min;
					sec_min=a[i];
				}
				else if(sec_min==th_min || th_min>a[i])
				{
					th_min=a[i];
				}
		
		}
		System.out.println(fis_min);
		System.out.println(sec_min);
		System.out.println(th_min);
		System.out.println("sum of 1st min 3 nos ==>> "+(fis_min+sec_min+ th_min));
	}

}
