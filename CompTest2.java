import java.util.*;
class Date 
{
	private int dd,mm,yy;
	void readDate()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input dd,mm,yy");
		dd=scan.nextInt();
		mm=scan.nextInt();
		yy=scan.nextInt();
	}
	void printDate()
	{
		System.out.printf("\n %d %d %d",dd,mm,yy);
	}
}
	class Person
	{
		private String name;
		Date dob=new Date();
		void readName()
		{
			Scanner scan =new Scanner(System.in);
			System.out.println("input name");
			name=scan.next();
		}
		void printName()
		{
			System.out.println(name);
		}
	}
class CompTest2
{
	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.readName();
		p1.dob.readDate();
		p1.printName();
		p1.dob.printDate();
	}
}
