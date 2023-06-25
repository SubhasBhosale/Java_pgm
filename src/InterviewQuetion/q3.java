package InterviewQuetion;

public class q3 {

	public static void main(String[] args) 
	{
		String a="aaa*#$%&bbb****eee**a";           //a3 b3 e3 a1
		for (int i = 0; i < a.length(); i++)
		{
			int count=1;
			if (a.charAt(i)==a.charAt(i+1))
			{
		
			for (int j = i+1; j < a.length(); j++) 
			{
				if (a.charAt(i)==a.charAt(j))
				{
					count++;
				}
				else
				{
					break;
				}}
			}
			if (a.charAt(i)>='a' && a.charAt(i)<='z')
			System.out.print(a.charAt(i)+""+count);
		}






		//		String[] c = b.split(" ");
		//		for (int i = 0; i < c.length; i++)
		//		{
		//			String z = c[i];
		//			int count=0;
		//			for (int j = 0; j < z.length(); j++) 
		//			{
		//				count++;
		//			}
		//			if(count>0)
		//			System.out.print(z.charAt(0)+""+ count);
		//		}



































		//	ArrayList<Character> set = new ArrayList<Character>();
		//		LinkedHashSet<Character> Lset = new LinkedHashSet<Character>();
		//		for (int i = 0; i < a.length(); i++)
		//		{
		//			if (a.charAt(i)>='a' && a.charAt(i)<='z')
		//			{
		//				set.add(a.charAt(i));
		//				Lset.add(a.charAt(i));
		//			}
		//		}
		//		System.out.println(set);
		//		System.out.println(Lset);
		//		for (Character s : set)
		//		{
		//			int count=0;
		//			for (int i = 0; i < args.length; i++) 
		//			{
		//				if (set.equals(Lset))
		//				{
		//					count++;
		//				}
		//			}
		//			System.out.println(count+" "+s);
		//		}



		//		        String a = "aaa****bbb****eee**a";
		//		        String result = "";
		//
		//		        int count = 1;
		//		        char currentChar = a.charAt(0);
		//
		//		        for (int i = 1; i < a.length(); i++) {
		//		            char c = a.charAt(i);
		//		            if (c == currentChar) {
		//		                count++;
		//		            } else {
		//		                result += currentChar + Integer.toString(count);
		//		                currentChar = c;
		//		                count = 1;
		//		            }
		//		        }
		//
		//		        result += currentChar + Integer.toString(count);
		//		        System.out.println(result);
	}
}
