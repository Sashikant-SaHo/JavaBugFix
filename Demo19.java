import java.util.Scanner;
class Demo19 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("input 3 subject marks");
		int sub1=scan.nextInt();
		int sub2=scan.nextInt();
		int sub3=scan.nextInt();
		if (sub1>=40)
		if (sub2>=40)
		if (sub3>=40)
		 System.out.println("pass");
		else
			System.out.println("fail");
	}
}
