package assignment;

public class mock 
{
	public static void main(String[] args) 
	{
		String s1="a11b22c33";       //o/p => 12

		char[] b = s1.toCharArray();
		
	//	boolean[] rs=new boolean[b.length];

		for (int i = 0; i < b.length; i++) 
		{
			//if(rs[i]==false) 
			{
				for(int j=i+1; j < b.length ; j++) 
				{
					if(b[i]==b[j]) 
					{
						if(b[i]=='1'||b[i]=='2') 
						{
						//z	rs[j]=true;
							System.out.print(b[i]);
						}
					//	rs[j]=true;
					}
				}
			}
		}

	}
}


