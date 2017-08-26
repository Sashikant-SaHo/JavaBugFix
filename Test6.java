class  	A
{
	int x=10;
	int y=20;
}
class B extends A
{
	int p=30;
	int q=40;
}
class Test6
{
	public static void main(String[] args) 
	{
		B objb=new B();
		System.out.println(objb.x);
		System.out.println(objb.y);
		System.out.println(objb.p);
		System.out.println(objb.q);
	}
}
