class ExceptionTest4 
{
	static int div(int n1,int n2)
	{
		int n3=0;
		try
		{
			System.out.println("inside try block");
			n3=n1/n2;
			return n3;
		}
		catch (ArithmeticException e)
		{
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside final block");
		}
		return n3;
	}
	public static void main(String[] args) 
	{
		int	res=0;
		res=div(5,2);
		System.out.println(res);
		res=div(5,0);
		System.out.println(res);
	}
}
