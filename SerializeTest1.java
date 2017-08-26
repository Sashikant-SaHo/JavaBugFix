import java.io.*;
class  Employee implements Serializable
{
	private int empno;
	private String ename;
	private float sal;
	Employee(int empno,String ename,float sal)
	{
		this.empno=empno;
		this.ename=ename;
		this.sal=sal;
	}
	int gatEmpno()
	{
		return empno;
	}
	String getEname()
	{
		return ename;
	}
	float getSal()
	{
		return sal;
	}
}
class SerializeTest1
{
	public static void main(String[] args)throws Exception
	{
		Employee emp=new Employee(1111,"sashikanta",6000f);
		FileOutputStream fos=new FileOutputStream("file2");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
	}
}
