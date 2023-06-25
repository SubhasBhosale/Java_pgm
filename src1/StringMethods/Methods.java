package StringMethods;

public class Methods {

	public static void main(String[] args) {
			String a="hello";
			String b="ok";
			
			
		System.out.println(a.charAt(1));           // e
		System.out.println(a.contains("he"));      // true
		System.out.println(a.lastIndexOf('l'));
		System.out.println(a.concat(b));           //hellook
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(1));
		int s = a.indexOf(a.charAt(0));    //if -1 it is not equal
		System.out.println(s);
	}
}
