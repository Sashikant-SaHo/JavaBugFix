class Msg implements Runnable 
{
	public void run()
	{
		for (int i=0;i<=10 ;i++ )
		System.out.println("sashikanta");
	}
}		
class ThreadTest1
{
	public static void main(String[] args)throws Exception 
	{
		Msg obj=new Msg();
		Thread t1=new Thread(obj);
		t1.start();
	}
}
