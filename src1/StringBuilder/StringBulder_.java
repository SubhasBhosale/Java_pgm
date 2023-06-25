package StringBuilder;

public class StringBulder_ 
{
	public static void main(String[] args) 
	{
		String a="hello";

		StringBuilder sb = new StringBuilder(a);
//		System.out.println(sb.reverse());
		
//		sb.append(123);
		
//		sb.append("_OK");
		
		int capacity = sb.capacity();
		
		System.out.println(capacity);
	}
}