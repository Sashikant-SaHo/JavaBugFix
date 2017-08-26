class Account 
{
	private int accno;
	private String name;
	private float salary;
	void setAccno(int accno)
	{
		this.accno=accno;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	int getAccno()
	{return accno;
	}
	String getName()
	{
		return name;
	}
	float getSalary()
	{
		return salary;
	}
}
	class SavingAccount extends Account
	{
	private boolean cheqfac;
	void setCheqfac(boolean cheqfac)
		{
		this.cheqfac=cheqfac;
		}
		boolean getCheqfac()
		{
			return cheqfac;
		}
	}
class Inheritance1
	{
	public static void main(String[] args) 
	{
		SavingAccount acc1=new SavingAccount();
		acc1.setAccno(111222333);
		acc1.setName("sashikanta");
		acc1.setSalary(20000f);
		acc1.setCheqfac(true);
		System.out.println(acc1.getAccno());
		System.out.println(acc1.getName());
		System.out.println(acc1.getSalary());
		System.out.println(acc1.getCheqfac());
	}
}
