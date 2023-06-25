package string;

public class sumIntingivenArray 
{
public static void main(String[] args)
{
	String s="11b10c5";   //o/p ==>> 26
	int sum=0;    //11 21
	int tsum=0;    //1 11 0 1 10 0 5
	for (int i = 0; i < s.length(); i++) 
	{
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			int n=s.charAt(i)-48;  //n=5 53-48=5
			tsum=tsum*10+n;     //tsum=5 0*10+5=5
		}
		else
		{
			sum=sum+tsum;      //sum=21    11+10
			tsum=0;       //tsum=0 0
		}
	}
	sum=sum+tsum;    //sum=21+5=26
	System.out.println(sum);     //26
}
}
