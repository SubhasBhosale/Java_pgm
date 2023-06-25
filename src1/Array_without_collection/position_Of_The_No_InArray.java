package Array_without_collection;

public class position_Of_The_No_InArray 
{
	public static void main(String[] args) 
	{
		int[] a= {2,4,4,6,5,6,4};

		for (int i = 0; i < a.length; i++)
		{
		boolean	flag=false;
			for (int j = i+1; j < a.length; j++)
			{
				if (a[i]==a[j])
				{
					flag=true;
					break;
				}
			}
			if (flag==false)
			{
				System.out.println(a[i]+" ==>> "+(i+1));
			}
		}
	}
}

//HashSet<Integer> set = new HashSet<Integer>();
//
//for (int i = 0; i < a.length; i++) 
//{
//	if(set.add(a[i])==true)
//	{
//		System.out.println(a[i]+" "+(i+1));
//	}
//}

/*2 1
4 2
6 4
5 5
*/