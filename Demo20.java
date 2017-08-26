import java.util.Scanner;
class Demo20 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input any two integers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		System.out.println("Add");
		System.out.println("sub");
		System.out.println("mul");
		System.out.println("div");
		System.out.println("input ur option");
		int opt=scan.nextInt();
		int res=0;
		switch (opt)
		{
		case 1:
			res=n1+n2;
		break;
		case 2:
			res=n1-n2;
		break;
		case 3:
			res=n1*n2;
		break;
		case 4:
			res=n1/n2;
		break;
		default:
			System.out.println("invalid option");
		}
		System.out.println(res);
	}
}
