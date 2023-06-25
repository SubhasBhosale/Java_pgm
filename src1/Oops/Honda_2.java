package Oops;


class Honda_2 extends Bikes_1
{
	void run() //we overrided the main method
	{
		System.out.println("running safely..");
	}
	public static void main(String args[])
	{
		Bikes_1 obj = new Honda_2();
		obj.run();
	}
}
