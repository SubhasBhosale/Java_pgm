package practice_HM;

public class sumOfNumbersInString {

	public static void main(String[] args) {
		String s="1b2c5d";
		char[] a = s.toCharArray();
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>='0' && a[i]<='9')
			{
				sum=sum+a[i]-48;     //-48 (impo)
			}
		}
		System.out.println(sum);
	}

}
