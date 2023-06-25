package array;

public class sumOf_1st_Three_Maxno {
	public static void main(String[] args)
	{
		int []arr= {7,2,0,1,5};

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum=0;
		for (int k = 0; k < 3; k++) {
			sum=sum+arr[k];
		}
		System.out.println(sum);
	}
}
