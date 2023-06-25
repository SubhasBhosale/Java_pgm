package assignment1;

import java.util.HashMap;
import java.util.Map.Entry;
public class q_13 {

	public static void main(String[] args) {
		int a[] = { 7, 2, 12, 15 };
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) 
		{
			map.put(i, a[i]);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) 
		{
			int n = entry.getValue();
			for (Entry<Integer, Integer> e : map.entrySet()) 
			{
				if ((e.getValue() + n) == 9)
					System.out.println(n + " and " + e.getValue() + " = 9");
			}
		}
	}
}
//o/p => 9



