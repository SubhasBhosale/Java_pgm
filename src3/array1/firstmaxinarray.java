package array1;

public class firstmaxinarray {
public static void main(String[] args) {
	int []arr= {7,2,3,9,5};
	int firstmax=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>firstmax)
		{
			firstmax=arr[i];
		}
	}
	System.out.println(firstmax);
}
}
