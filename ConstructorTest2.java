class  Rectangle
{
	private float l,b;
	Rectangle()
	{
		l=1.5f;
		b=2.5f;
	}
	float findArea()
	{
		return l*b;
	}
}
	class ConstructorTest2
	{
	public static void main(String[] args) 
	{
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle();
		float a1=rect1.findArea();
		float a2=rect2.findArea();
		System.out.println(a1);
		System.out.println(a2);
	}
}
