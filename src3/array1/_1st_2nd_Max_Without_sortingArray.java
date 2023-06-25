package array1;

public class _1st_2nd_Max_Without_sortingArray {
	public static void main(String[] args) {
		int []arr= {0,7,8,8,10,2,6,9,9,1,1};   
		int fmax=0;
		int smax=0;
		int tmax=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>=fmax)
			{
				if(arr[i]!=fmax)
				{
					smax=fmax;
				}
				fmax=arr[i];
			}
			else if(fmax==smax || arr[i]>smax)
			{
				smax=arr[i];
			}
		}
		System.out.println("The 1st max no ==>> "+fmax);
		System.out.println("The 2nd max no ==>> "+smax);
	}
}
