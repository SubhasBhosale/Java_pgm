package InterviewQuetion;


public class q5 {

	public static void main(String[] args) {
		String a="how||are||you";
//		String c = a.replace("||", " ");
//		String[] b = c.split(" ");



//		for (int i = 0; i < b.length; i++)
//		{
//			System.out.println(b[i]);
//		}
		
	String[] b = a.split("\\|\\|");
	for (int i = 0; i < b.length; i++) 
	{
		System.out.println(b[i]);
	}

	
		
		
		
		//		for (int i = 0; i < a.length(); i++) 
		//		{
		//			if (a.charAt(i)>='a' && a.charAt(i)<='z')
		//			{
		//				
		//				System.out.print(a.charAt(i));
		//			}
		//		}
	}

}
