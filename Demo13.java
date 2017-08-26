import java.util.*;
class Demo13 
{
	public static void main(String[] args)throws IoException 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferReader br=new BufferReader(isr);
		System.out.println("input name");
		String name=br.readLine();
		System.out.println("Name");
	}
}
