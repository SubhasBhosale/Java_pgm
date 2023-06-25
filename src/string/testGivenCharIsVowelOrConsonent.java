package string;

public class testGivenCharIsVowelOrConsonent {
public static void main(String[] args) {
	char c = 'a';

	if(c =='a' ||c =='e'||c =='i'||c =='o'||c =='u'||c =='A' ||c =='E'||c =='I'||c =='O'||c =='U') //not string thats we use ->> ==
	{
		System.out.println("given char is vowel");
	}
	else
	{
		System.out.println("given char is consonent");
	}
}
}
