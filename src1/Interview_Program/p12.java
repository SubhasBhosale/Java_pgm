package Interview_Program;

public class p12 {
	public static void main(String[] args) {

		String a="subhas";
		char[] b=a.toCharArray();
		
		for (int i = 0; i < b.length; i++) 
		{
			boolean flag=false;
			for (int j = i+1; j < b.length; j++) 
			{
				if (b[i]==b[j]) 
				{
					flag=true;
				}
			}
			if (flag==false)
			{
				System.out.print(b[i]);
			}
		}
	}
}
