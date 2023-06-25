package factorial;

public class findThePrimeNoFrom0to20_sir {
public static void main(String[] args) {
	for (int i = 0; i <=20 ; i++) 
	{ 
		int n=i;
		int j=2;
		while(j<=n)        //j<=i  //2<=(n)2,3,4,5
		{
			if(n%j==0)             
			{
				break;
			}
			else
			{
				j++;
			}
		}
		if(j==n) 
		{
			System.out.println(n);
		}
	}
}
}
