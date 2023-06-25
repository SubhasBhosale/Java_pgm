package assignment;
public class q_14 {
	public static void main(String[] args) 
	{
		String s1="This is fun show";
		String s2="fun tv show";            //o/p => this is tv
		String[] a = s1.split(" ");    //String[] a={"This",""};
		String[] b = s2.split(" ");
		String str="";
		for (int i = 0; i < a.length; i++)        // for every time the loop starts flag will be again true as we have mentioned
		{
			boolean  flag=true;
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i].equals(b[j]))           //we are only thinking of a[i] perspective 
				{
					flag=false;
					break;	
				}
			}
			if(flag==true)
			{
				str=str+a[i]+" ";                //we are taking action a[i] 
			}
		}
	/*	for (int i = 0; i < b.length; i++)
		{
			boolean  flag=true;
			for (int j = 0; j < a.length; j++) 
			{
				if (b[i].equals(a[j])) 
				{
					flag=false;
					break;	
				}
			}
			if(flag==true)
			{
				str=str+b[i]+" ";
			}
		}*/
		System.out.println(str);
	}
}