package prakash_SIR;
public class PrintNoInString2 
{
	public static void main(String[] args) 
	{
		String a="ab1234@ed02D";
		String b="";
		int count=0;
		int ascii=48;
		for (int i = 0; i < a.length(); i++) 
		{
			boolean	flag=false;
			//count++;
			if (a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				//if (a.charAt(i)) 
				{
					count=a.charAt(i)-48;
					//	System.out.print(a.charAt(i)-48);
					//System.out.print(count);
					//	System.out.println("+++++++++++++++++++++++++");
					flag=true;
				}
				System.out.print(a.charAt(i)-ascii);
				ascii--;
				if(count<a.charAt(i)-ascii  && flag==true)
				{
					//	System.out.print(count);
				}
			}}}}