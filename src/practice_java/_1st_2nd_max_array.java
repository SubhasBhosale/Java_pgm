package practice_java;

public class _1st_2nd_max_array {

	public static void main(String[] args) {
		int []a= {0,7,8,8,10,2,6,9,9,1,10};
		int fmax=0;
		int smax=0;
		
			for (int i = 0; i < a.length; i++)
			{
				if (fmax<a[i])
				{
					fmax=a[i];
				}
				else if(fmax==smax || smax<a[i])
				{
					fmax=smax;
					smax=a[i];
				}
			}
			System.out.println(fmax);
			System.out.println(smax);
	
	}}
