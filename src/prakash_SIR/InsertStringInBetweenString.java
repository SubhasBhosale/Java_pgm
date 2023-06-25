package prakash_SIR;

import java.util.ArrayList;

public class InsertStringInBetweenString 
{
	public static void main(String[] args)
	{
		String[] a={"hello","how","you","bro"};
		String z = "are";

		String[] b=new String[a.length+1];		
		for (int i = 0; i < a.length/2; i++) 
		{
			b[i]=a[i];
		}
		b[a.length/2]=z;

		for (int i = (a.length/2); i < b.length-1; i++)
		{
			b[i+1]=a[i];
		}

		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}


//***************************************************************************************************************		
		
		//		for (int i = 0; i < a.length; i++)
		//		{
		//			if(i==0 || i==1)
		//			{
		//				System.out.print(a[i]+" ");
		//			}
		//			
		//			if (a[i]==a[2])
		//			{
		//				System.out.print(b+" "+a[i]);
		//			}		
		//		}

//***************************************************************************************************************
		
		//		ArrayList<String> list=new ArrayList<String>();
		//		list.add("are");
		//		for(int i=0;i<a.length;i++)
		//		{
		//			list.add(a[i]);
		//		}
		//		System.out.print(list);
	}
}
