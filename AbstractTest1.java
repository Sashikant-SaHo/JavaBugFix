abstract class Employee
{
	private int empno;
	private String ename;
	Employee(int empno,String ename)
	{
		this.empno=empno;
		this.ename=ename;
	}
	void print()
	{
		System.out.println(empno);
		System.out.println(ename);
	}
	abstract float CalSalary();
}
class Worker extends Employee
{
	private float wage;
	private int days;
	Worker(int empno,String ename,float wage,int days)
	{
		super(empno,ename);
		this.wage=wage;
		this.days=days;
	}
	float CalSalary()
	{
		return wage*days;
	}
}
class AbstractTest1
{
	public static void main(String[] args) 
	{
		Worker w=new Worker(111,"sashikanta",1000f,30);
		w.print();
		float CalSalary=w.CalSalary();
		System.out.println(CalSalary);
	}
}
