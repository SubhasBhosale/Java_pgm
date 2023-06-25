package interview_quetions;

public class SONY_linear_print {

	public static void main(String[] args) {
		String s= "Selenium";
		String b="";
		int count=0;
		while(count<s.length())
		{
			b=b+s.charAt(count);
			System.out.print(b+" ");
			count++;
		}
	}
}

//O/p :s se sel sele selen seleni seleniu selenium