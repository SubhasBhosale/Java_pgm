package trackmind;

public class Duplicate_values_in_string_wihtout_collection 
{
	public static void main(String[] args) 
	{
		String str = "aabbcccdaghgk";
		int length = str.length();

		// Iterate over each character
		for (int i = 0; i < length; i++) {
			char c = str.charAt(i);
			boolean isDuplicate = false;

			// Compare with the rest of the characters
			for (int j = i + 1; j < length; j++) {
				if (c == str.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}

			// Print duplicate characters
			if (isDuplicate) {
				System.out.println(c);
			}
		}	

	}
}