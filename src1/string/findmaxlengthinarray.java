package string;

public class findmaxlengthinarray {
public static void main(String[] args) {
	
	String[] s= {"ab","a","abc","abcd","b","bcdf"};
		String max_length=s[0];
		for (int i = 0; i < s.length; i++) {
			if (max_length.length()<s[i].length()) {
				max_length=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (max_length.length()==s[i].length()) {
				System.out.println(s[i]);
			}
		}


}
}
