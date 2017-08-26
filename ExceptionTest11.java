import java.util.* ;
class  	Printer implements Cloneable
{
	void print()throws ArithmeticException
	{
		System.out.println("inside printer");
		System.out.println(new  ArithmeticException()+"this is constructor calling");
	}
	public void close()
	{
		System.out.println("printer closed");
	}
}
class ExceptionTest11
{
	public static void main(String[] args) {
		Printer p=null;
		try
		{
			 p=new Printer();
			p.print();
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		  p.close();
	}
}
