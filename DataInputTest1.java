import java.io.*;
class  	DataInputTest1
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("file1.txt");
		DataInputStream dis=new DataInputStream(fis);
		int a=dis.readInt();
		float b=dis.readFloat();
		double c=dis.readDouble();
		boolean d=dis.readBoolean();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		dis.close();
		fis.close();
	}
}
