class Point 
{
	private int x,y;
	Point()
	{
		x=100;
		y=200;
	}
	void setx(int x)
	{
		this.x=x;
	}
	void sety(int y)
	{
		this.y=y;
	}
	void printxy()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
class ConstructorTest3
{
	public static void main(String[] args) 
	{
		Point p1=new Point();
		p1.printxy();
		p1.setx(200);
		p1.printxy();
		p1.sety(400);
		p1.printxy();
		p1.sety(600);
		p1.printxy();
	}
}
