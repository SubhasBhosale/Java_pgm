package practice_HM;

public class findmaxlengthinarray {

	public static void main(String[] args) {
		String[] s= {"ab","a","abc","abcd","b","bcdf"};
		String a = s[0];
		for (int i = 0; i < s.length; i++) 
		{
			if (a.length()<s[i].length()) 
			{
				a=s[i];
			}
		}
		for (int j = 0; j < s.length; j++) {
			if(a.length()==s[j].length())
			{
				System.out.println(s[j]);
			}	
		}
		
	//	System.out.println(a);
		
		
		
	}

}
