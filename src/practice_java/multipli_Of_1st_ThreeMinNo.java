package practice_java;

import java.util.Iterator;

public class multipli_Of_1st_ThreeMinNo {

	public static void main(String[] args) {
		int []a= {7,2,0,1,5};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		int b=1;
		for (int i = 0; i < 3; i++) 
		{
			b=b*a[i];
		}
		System.out.println();
		System.out.print("first three no multiplication ==>> "+b);
	}
}
