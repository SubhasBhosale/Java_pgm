package string;

public class bubblesortunique {
	public static void main(String[] args) {

		String a="hi";
		String b="hiii";
		System.out.println(a.compareTo(b));     //hiii-hi=4-2= 2
		//if hi-hiii=2-4= -2


/*1
12
4
53
7345234
*/
		String[] s= {"12","1","53","4","7345234"};            
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (int k = 0; k < s.length; k++) {
			System.out.println(s[k]);
		}
	}
}