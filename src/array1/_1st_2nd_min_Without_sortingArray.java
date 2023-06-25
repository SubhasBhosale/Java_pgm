package array1;

public class _1st_2nd_min_Without_sortingArray {
public static void main(String[] args) {
	int []arr= {0,7,2,6,9,1};                         //we should NOT follow this bcz array having 0 so value will be 0 in the result
	int firstmin=arr[0];
	int sec=arr[0];                                  //NOT  NO NO NO NO NO  
	for (int i = 0; i < arr.length; i++) 
	{
		if(arr[i]<firstmin)                    //NO NO NO NO NO NO NO NO NO NO NO NO NO NO 
		{
			firstmin=arr[i];
		}
	}
	for (int j = 0; j < arr.length; j++) {
		if(arr[j]==firstmin)
		{
		}
		else if(arr[j]<sec)
		{
			sec=arr[j];
		}
	}
	System.out.println(firstmin);
	System.out.println(sec);
}
}
