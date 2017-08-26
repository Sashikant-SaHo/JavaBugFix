class ExceptionTest10 
{
	public static void main(String[] args) 
	{
		try
		{
			int n=Interger.parseInt(args[0]);
			System.out.println(n);
		}
		catch (ArrayIndexOutOfBoundException e)
		{
			System.out.println(n);
		}
	}
}
