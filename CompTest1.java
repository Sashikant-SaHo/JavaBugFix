class A 
{
	int x=10;
}
class B
{
	int y=20;
	A obja=new A();
}
class C
{
	int z=30;
	B objb=new B();
}
class CompTest1
{
	public static void main(String[] args) 
	{
		C objc=new C();
		System.out.println(objc.z);
		System.out.println(objc.objb.y);
		System.out.println(objc.objb.obja.x);
	}
}
