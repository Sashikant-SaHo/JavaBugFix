import java.util.*;
interface Flight
{
	String getName();
	double getCost();
}
class AirIndia implements Flight
{
	public String getName()
	{
		return "AirIndia";
	}
	public  double getCost()
	{
		return 30000.50;
	}
}
class SpiceJet implements Flight
{
	public String getName()
	{
		return "SpiceJet";
	}
	public  double getCost()
	{
		return 400000.50;
	}
}
class FindFlight
{
	public static void main(String args[])throws Exception

	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Input flight name");
		String name=scan.next();
		Object obj=Class.forName(name).newInstance();
		Flight f=(Flight)obj;
		System.out.println(f.getName());
		System.out.println(f.getCost());
	}
}

