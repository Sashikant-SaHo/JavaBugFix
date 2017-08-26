import java.util.*;
class Demo25 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input any numbers");
		int n=scan.nextInt();
		int sum=0;
		while (true)
		{
			if(n==0)
				break;
			sum=sum+n;
			n=n-1;
		}
		System.out.println("sum" );
	}
}
