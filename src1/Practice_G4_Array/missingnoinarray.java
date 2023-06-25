package Practice_G4_Array;

public class missingnoinarray 
{
	public static void main(String[] args) 
	{

		int[] b = {1, 4, 9, 7, 8};
		int[] missing = new int[10 - b.length]; // create an array to store missing elements
		int index = 0; // index of the missing array

		// loop through each number in the range 1 to 10
		for (int i = 1; i <= 10; i++) {
			boolean found = false;
			// check if the number exists in the array b
			for (int j = 0; j < b.length; j++) {
				if (b[j] == i) {
					found = true;
					break;
				}
			}
			// if the number is not found in the array b, add it to the missing array
			if (!found) {
				missing[index] = i;
				index++;
			}
		}

		// print the missing elements
		System.out.print("Missing elements: ");
		for (int i = 0; i < missing.length; i++) {
			if (missing[i] != 0) {
				System.out.print(missing[i] + " ");
			}
		}	
	}
}


/*
int[] b={1,4,9,7,8};
int a=b[0];
int z=b[b.length-1];

for (int i = 0; i < b.length; i++) 
{
	for (int j = a; j <= z; j++) 
	{
		if (b[i]!=j)
		{
			System.out.println(j);
		}
	}
}*/