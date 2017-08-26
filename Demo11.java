import java.util.Scanner;
class Demo11
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Input first numbers");
		int num1=scan.nextInt();
		System.out.println("Input second number");
		int num2=scan.nextInt();
		int n3=num1+num2;
		System.out.printf("\n sum is %d",n3);
	}
}
