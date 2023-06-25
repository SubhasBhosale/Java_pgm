package Array;

public class Addtion_Of_1st_ThreeMinNoInArray {

	public static void main(String[] args) {
		int []arr= {7,2,0,1,5,1};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		int a=0;
		for (int i = 0; i < 3; i++) 
		{
			a+=arr[i];
		}
		System.out.println(a);
	}

}
