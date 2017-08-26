class A 
{
	int x;
	static int y;
}
class Test3
{
	public static void main(String[] args) 
	{
		A obj1=new A();
		A obj2=new A();
		A obj3=new A();
		obj1.x=10;
		obj2.x=20;
		obj3.x=30;
		obj1.y=40;
		obj2.y=50;
		obj3.y=60;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		System.out.println(obj3.x);
		System.out.println(obj1.y);
		System.out.println(obj2.y);
		System.out.println(obj3.y);
	}
}
