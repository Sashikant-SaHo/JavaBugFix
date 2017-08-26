class Account
{
	private int accno;
	private float salary;
	static float rate;
void setAccount(int accno,float salary)
{
	this.accno=accno;
	this.salary=salary;
}
void printAccount()
{
	System.out.println(accno);
	System.out.println(salary);
	System.out.println(rate);
}
}
class Test4
{
	public static void main(String[] args) 
	{
		Account.rate=1.5f;
		Account acc1=new Account();
		Account acc2=new Account();
		acc1.setAccount(101,5000f);
		acc2.setAccount(102,7000f);
		acc1.printAccount();
		acc2.printAccount();
		
	}
}
