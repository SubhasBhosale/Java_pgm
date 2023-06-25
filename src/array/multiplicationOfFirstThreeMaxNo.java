package array;

public class multiplicationOfFirstThreeMaxNo
{
public static void main(String[] args) 
{	
	int []arr= {7,2,0,1,5};
	for (int i = 0; i < arr.length; i++) 
	{
		for (int j = i+1; j < arr.length; j++) 
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for (int k = 0; k < arr.length; k++) 
	{
		System.out.print(arr[k]);
	}
	System.out.println();
	int m=1;
	for (int s = 0; s < 3; s++) 
	{
		m=m*arr[s];
	}
	System.out.println("first 3 max multiplication ==>> "+m);
}
}
