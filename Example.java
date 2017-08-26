class Example 
{
	static void m1() 
	{
		System.out.println("example m1()");
		m2();
	}
	static void m2()
	{
		System.out.println("example m2()");
	}
	public static void main(String args[])
	{
		System.out.println("example main");
		m1();
	}
}
