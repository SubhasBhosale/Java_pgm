package pattern;

public class pattern3 {
public static void main(String[] args) {
	int n=4;
	for (int i = 0; i < n; i++) 
	{
		for (int j = i; j < n; j++) 
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for (int m = 0; m < n; m++) 
	{
		for (int k = 0; k <m ; k++) 
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
