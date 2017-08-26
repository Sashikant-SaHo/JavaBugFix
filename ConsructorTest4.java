class Date 
{
	private int dd,mm,yy;
	Date(int d,int m,int y)
	{
		dd=d;mm=m;yy=y;
	}
	void printDate()
	{
		   System.out.println("\n %d %d %d",dd,mm,yy)
}
class ConstructorTest4
{
	public static void main(String[] args) 
	{
		Date d1=new Date(9,11,2016);
		d1.printdate();
		Date d2=new Date(7,11,2015);
		d2.printDate();
	}
}
