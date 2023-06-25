package array1;

public class arrayDesc {
public static void main(String[] args) {
	int [] a= {7,2,0,1,5};
	for(int i =0;i<a.length;i++)  //this is for no of iterations
	{
		for(int j=i+1;j<a.length;j++)  //this is for comparing 2 values in array
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++)  //this is for printing purpose ,printing of an array
	{
		System.out.print(a[i]+" ");
	}
}
}
