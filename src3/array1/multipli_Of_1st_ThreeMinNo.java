package array1;

public class multipli_Of_1st_ThreeMinNo 
{
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
	for (int k = 0; k < arr.length; k++) {
		System.out.print(arr[k]);
	}
	System.out.println();
	int sum=1;
	for (int t = 0; t <arr.length-1; t++)
	{
		sum=sum*arr[t];
	}
	
	System.out.println("first 3 multiplication of elements ===>> "+sum);

	int sum1=1;
	for (int t = arr.length-1; t >1; t--)
	{
		sum1=sum1*arr[t];
	}
	System.out.println("last 3 multiplication of elements ===>> "+sum1);


}
}
