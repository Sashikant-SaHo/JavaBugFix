package package1;
public class A
{
	private int x;
	int y;
	protected int z;
	public int p;
}
class B extends A
{
	void m1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
	}
}
