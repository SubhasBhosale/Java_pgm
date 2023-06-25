package array;

public class firstMinNoInArray {
	public static void main(String[] args) {
		int []arr= {7,2,0,1,9};

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("Array sorted in ascending order ===>  ");
		for (int k = 0; k < arr.length; k++) 
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	System.out.println("value at the 1st index ==> "+arr[0]);

	System.out.println("value at the 2nd index ==> "+arr[1]);

	System.out.println("value at the 2nd last index ==> "+arr[arr.length-2]);
	
	}
}
