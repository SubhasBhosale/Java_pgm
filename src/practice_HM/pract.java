package practice_HM;

public class pract 
{
	private int a;
	private  pract(int a)    //bcz contructor will not have any return type
	{
		this.a=a;
	}
	public int get()
	{
		return a;
	}
	public static void main(String[] args) 
	{
		pract p = new pract(10);
		System.out.println(p.get());
	}

}
