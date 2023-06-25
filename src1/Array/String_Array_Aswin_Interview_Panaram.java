package Array;
import java.util.HashMap;
import java.util.Map;
public class String_Array_Aswin_Interview_Panaram 
{
	public static void main(String[] args) 
	{
		//		String[] a= {"7","ABC","CBA","XYZ","AABD","BAAD","PRSH","DABA"};            // o/p => xyz   ,   PRSH
		String str = "Hello World!";
		Map<Character, Integer> charCount = countCharacters(str);
		// Print the character occurrences
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) 
		{
			System.out.println(entry.getKey() + "=>   " + entry.getValue());
		}
	}
	public static Map<Character, Integer> countCharacters(String str) 
	{
		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : str.toCharArray())
		{
			if (charCount.containsKey(c)) 
			{
				charCount.put(c, charCount.get(c) + 1);
			} else 
			{
				charCount.put(c, 1);
			}
		}
		return charCount;
	}
}