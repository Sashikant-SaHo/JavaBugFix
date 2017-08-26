import java.io.*;
class  DserializeTest1
{
	public static void main(String[] args)throws Exception 
	{
		FileInputStream fis=new FileInputStream("file2");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee)ois.readObject();
		System.out.println(emp.getEmpno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
	}
}
