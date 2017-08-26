class Account 
{
	private int accno;
	private String name;
	private float balance;
	Account(int accno,String name)
	{
		this.accno=accno;
		this.name=name;
	}
	Account(int accno,String name,float balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	void printAccount()
	{
		System.out.println(accno);
		System.out.println(name);
		System.out.println(balance);
	}
}
class ConstructorTest6
{
	public static void main(String[] args) 
	{
		Account a1=new Account(102,"sashikanta",10000f);
		Account a2=new Account(103,"kunal",20000f);
		a1.printAccount();
		a2.printAccount();
	}
}
