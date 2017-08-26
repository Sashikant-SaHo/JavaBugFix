import java.io.*; 
class   A implements Serializable
{
	int x=10;
	transient int y=20;
}
class SerializeableTest2
{														   
	public static void main(String[] args)throws Exception
	{
		FileOutputStream fos=new FileOutputStream("file3");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		A obj=new A();
		oos.writeObject(obj);
	}
}
