package prakash_SIR;

public class aaabbcdddf__a3b2cd3f {

	public static void main(String[] args) {
		String a="aaabbcdddf";   //op=> a3b2cd3f

		int count=1;
		for(int i=0;i<a.length();i=i+count)
		{
			count=1;
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;  //3
				}
				else //if (a.charAt(i)!=a.charAt(j))								//a3b2cd3f	//a3b2cd3f
				{
					break;
				}
			}
			
			if(count==1)
			{
				System.out.print(a.charAt(i));
			}
			else
			System.out.print(a.charAt(i)+""+count);
		}
	}
}
