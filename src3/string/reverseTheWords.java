package string;

public class reverseTheWords {
public static void main(String[] args) {
	String s="I am from Bangalore";      //I ma morf erolagnaB 
	String[] z = s.split(" ");  //it will be exactly like this ==>> String[] b = {"I","am","from","Bangalore"};
	
	for (int i = 0; i < z.length; i++) //I - 0 , am - 1 ,from - 2 , Bangalore - 3
	{
		String str = z[i]; //I - 0, am - 1
		for (int j = str.length()-1; j >=0; j--) //particular word will repeat itself
		                                            	// length of particular word 
		{
			System.out.print(str.charAt(j));     //each string at "str" will get reverse 
		}
		System.out.print(" "); //give space in between words
	}
}
}
