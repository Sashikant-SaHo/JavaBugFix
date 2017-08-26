import java.util.Scanner;
class Demo18 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input any numbers");
		int n=scan.nextInt();
		if (n>0)
		System.out.println("it is positive number");
		else
		if (n<0)
		System.out.println("it is negative number");
		else
			System.out.println("it is zero");
	}
}
