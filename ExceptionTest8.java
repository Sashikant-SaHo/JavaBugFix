class InsufficentBalException extends Exception 
{
	InsufficentBalException(String msg)
	{
		super(msg);
	}
}
class Account
{
	private int accno;
	private float balance;
	Account(int accno,float balance)throws Exception
	{
		this.accno=accno;
		this.balance=balance;
	}
	void Withdraw(float amount)
	{
		if(amount<balance)
			balance=balance-amount;
		else
			throw new InsufficentBalException("Insufficent Balance");
	}
	void printAccount()
	{
		System.out.println(accno);
		System.out.println(balance);
	}
}
class ExceptionTest8
{
	public static void main(String[] args) 
	{
		 Account acc1=null;
		try{
		acc1=new Account(112233,50000f);
		acc1.printAccount();
			acc1.Withdraw(60000f);
		}
		catch(InsufficentBalException a)
		{
		System.out.println(a.getMessage());
		}
	}
}
