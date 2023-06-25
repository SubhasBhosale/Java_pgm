package Practice_G3_char;

public class PositionOfCharInString {

	public static void main(String[] args) {
		String s = "Subhas Bhosale";
//	String r = s.replace(" ", "");
	for (int i = 0; i < s.length(); i++) {
		System.out.println(s.charAt(i)+" ==>> "+(i+1));
	}
	
	}

}
