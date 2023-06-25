package array;

public class sumOf_1st_Three_Minno {
public static void main(String[] args) {
	int []arr= {7,2,0,1,5};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	int a=0;
	for(int i=0;i<3;i++)
	{
		a=a+arr[i];
	}
	System.out.println("Sum of first 3 min nos ==>> "+a);
}
}
