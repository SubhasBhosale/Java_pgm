package prakash_SIR;

public class FirstMaxWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a={7,-3,0,2,1,-9};

		int z=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(z>a[i])
			{
			   z=a[i];
			}
		}

		System.out.print(z);
	}

}
