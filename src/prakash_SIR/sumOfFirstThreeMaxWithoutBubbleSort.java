package prakash_SIR;

public class sumOfFirstThreeMaxWithoutBubbleSort 
{
	public static void main(String[] args) 
	{
		int[] a={7,-3,0,2,1,-9};
		   int z=0;
		   for (int i = 0; i < a.length; i++) 
		   {
			if (z<a[i]) 
			{
				z=a[i];
			}
		  }
		   System.out.println("1st max => "+z);
		   
		   int y=0;
		   for (int i = 0; i < a.length; i++) {
			if (y<a[i] && z!=a[i])
			{
				y=a[i];
			}
		}
		   System.out.println("2nd max => "+y);
		   
		   int x=0;
		   for (int i = 0; i < a.length; i++) 
		   {
			   if (x<a[i] && z!=a[i] && y!=a[i]) {
				x=a[i];
			}
		}
		   System.out.println("3rd max => "+x);
		   
		   System.out.println("total sum = "+(+x+y+z));
	}

}
