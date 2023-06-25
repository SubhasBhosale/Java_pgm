package practice_HM;
import java.util.HashMap;  
public class CountOccuranceOfChar1 {   
	public static void main(String args[])   
	{  
		String str1 = "TestYantra";  
		String str = str1.toLowerCase();
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> map = new HashMap<>();  
		for (int i = str.length() - 1; i >= 0; i--)   
		{  
			if(map.containsKey(str.charAt(i)))   
			{  
				int count = map.get(str.charAt(i));  
				map.put(str.charAt(i), ++count);  
			}   
			else   
			{  
				map.put(str.charAt(i),1);  
			}  
		}  
		System.out.println(map);  
	}  
}