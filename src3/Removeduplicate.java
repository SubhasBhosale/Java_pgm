
public class Removeduplicate {

	public static void main(String[] args) {
			int []a= {1,2,2,4,4,6,1};
			
			int b[]=new int[a.length];
			int c=0;
			for (int i = 0; i < a.length; i++) 
			{
				if (c<a[i])
				{
					b[i]+=a[i];
				}
			}
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[j]);	
			}
			
	}

}
