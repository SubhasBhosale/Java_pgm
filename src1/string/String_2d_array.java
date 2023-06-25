package string;

import java.util.ArrayList;

public class String_2d_array {

	public static void main(String[] args) {
		String[][] a= {
				        {"a","b","c","d","e","f"},
				        {"1","2","3","4","5"}
				      };
		
		//o/p=> [a1,b2,c3,d4,5]
		int length=0;
		if(a[0].length>a[1].length)
			length=a[0].length;
		else
			length=a[1].length;
		ArrayList<String>al=new ArrayList<String>();
		for(int i=0;i<a.length-1;i++) {
			String str="";
			
			for(int j=0;j<length;j++) {
				try {
				str=a[i][j]+a[i+1][j];
				al.add(str);
				}
				catch(Exception e){
					if(length==a[0].length)
					al.add(a[0][j]);
					else
						al.add(a[1][j]);
				}
			}
			
		}
		System.out.println(al);
	}
}