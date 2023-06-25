package assignment;

public class pract_remaining_no {
public static void main(String[] args) {
	int[] a= {1,4,6,8};
	
	
	for (int i = 0; i <= 10; i++)
	{
		boolean flag = true;
		for (int j = 0; j < a.length; j++)
		{
			if (i==a[j]) 
			{
			flag=false;
			break;
			}
		}
		if(flag==true)
		{
			System.out.print(i+" ");
		}
	}
}
}
