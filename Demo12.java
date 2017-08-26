import java.util.Scanner;
class Demo12
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input name");
		String name=scan.next();
		System.out.println("input 3 subject marks" );
		int sub1=scan.nextInt();
		int sub2=scan.nextInt();
		int sub3=scan.nextInt();
		int total=sub1+sub2+sub3;
		float avg=total/3.0f;
		 System.out.printf("\n name is %s",name);
		 System.out.printf("\n total is %d",total);
		 System.out.printf("\n avg is %f",avg);
	}
}
