import java .util.*;
class  	 Employee
{
	private int empno;
	private String name;
	void read()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input empno");
		empno=scan.nextInt();
		System.out.println("input name");
		name=scan.next();
	}
	void print()
	{
		System.out.println(empno);
		System.out.println(name);
	}
}
class SalariedEmployee extends Employee
{
	private float salary;
	void read()
	{
		super.read();
		Scanner scan=new Scanner(System.in);
		System.out.println("input salary");
		salary=scan.nextFloat();
	}
	void print()
	{
		super.print();
		System.out.println(salary);
	}
}
class Overriding
{
	public static void main(String[] args) 
	{
		SalariedEmployee emp1=new SalariedEmployee();
		emp1.read();
		emp1.print();
	}
}
