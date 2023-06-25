package array;

public class addarray {
public static void main(String[] args) {
	int[] a= {2,4,1,5,6};
	int[] b= {3,2,4,1};
	for (int i = 0; i < a.length; i++) 
	{
		try {
			int c=b[i]+a[i];
			System.out.print(c+" ");
	    	}
		catch (Exception e) 
	    {	
	   		if(a.length>b.length)
	   		{
	   			System.out.println(a[i]);
	   		}
    		else
	   		{
	    		System.out.println(b[i]);
	   		}
		}
	}
	
	
}
}
