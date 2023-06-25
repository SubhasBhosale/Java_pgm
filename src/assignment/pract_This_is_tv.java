package assignment;

public class pract_This_is_tv {

	public static void main(String[] args) 
	{
		String s1="This is fun show";
		String s2="fun tv show";  
		String[] a = s1.split(" ");
		String[] b = s2.split(" ");
		
		
		for (int i = 0; i < a.length; i++)
		{
			boolean flag = true;
			for (int j = 0; j < b.length; j++)
			{
				if (a[i].equals(b[j]))        //bcz string comparison equals
				{
					flag=false;
					break;
				}
			}
			if (flag==true)
			{
				System.out.print(a[i]+" ");
			}
		}
		
		for (int j = 0; j < b.length; j++)
		{
			boolean flag = true;
			for (int i = 0; i < a.length; i++)
			{
				if (b[j].equals(a[i]))
				{
					flag=false;
					break;
				}
				 
			}
			 if(flag==true)
			 {
				 System.out.print(b[j]);
			 }
			
		}
	}
	
}
