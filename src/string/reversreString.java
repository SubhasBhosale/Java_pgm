package string;
public class reversreString {
	public static void main(String[] args) {
		String s="Bangalore";

		//1st way
		String b="";
		for (int i = s.length()-1; i >=0; i--)
		{
			b=b+s.charAt(i);
		}
		System.out.println(b);

		//2nd way
		char[] abb = new char[s.length()];
		abb=s.toCharArray();
		for (int i = abb.length-1; i >=0; i--) 
		{
			System.out.print(abb[i]);
		}

		//3rd way
		System.out.println();
		for (int i = s.length()-1; i >=0; i--) 
		{
			System.out.print(s.charAt(i));
		}

		//4th way  -->> by using count variable
		System.out.println();
		char[] add = s.toCharArray();
		int count=0;
		for (char c : add)
		{
			count++;
		}
		for (int i = count-1; i >=0; i--) 
		{
			System.out.print(add[i]);
		}

		//5th way -->>  By using string builder
		System.out.println();
		StringBuilder q = new StringBuilder("Bangalore");
		System.out.println(q.reverse());
	}}