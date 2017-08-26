import java .util.*;
class Demo26
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("input any number");
		int num=scan.nextInt();
		int i=1,count=0;
		while (i<=num)
		{
			if(num%i==0)
				count=count+1;
			if(count>2)
				break;
			i=i+1;
		}		  
		if(count==2)
		System.out.println("Number is prime");
		else																  
			System.out.println("Number is not prime");
	}
}
