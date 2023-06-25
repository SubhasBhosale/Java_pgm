package assignment;

public class q_12 {
	public static void main(String[] args) {
	String str="I love programming";	 //o/p => I evol gnimmargorp
	String[] a = str.split(" ");
	
	for (int i = 0; i < a.length; i++) 
	{
		 String st = a[i];
		 for (int j = st.length()-1; j >= 0 ; j--) 
		 {
			System.out.print(st.charAt(j));
		}
		 System.out.print(" ");
	}
}}
