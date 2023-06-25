package interview_quetions;

public class SONY_3 {

	public static void main(String[] args) {
		String a= "aabbaa";
		for (int i = 0; i < a.length(); i++) 
		{
			System.out.print(a.charAt(i));
			//	int y = a.charAt(i+1);

			try
			{
				System.out.print(a.charAt(i+1)+" ");
			}
			catch (Exception e) 
			{
				System.out.println(a.charAt(i));
			}

		}

	}
}
//O/p : aa ab bb ba aa