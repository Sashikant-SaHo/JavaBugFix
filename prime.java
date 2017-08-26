class Prime 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int num,i,c=0;
		System.out.println("enter a number");
		num=sc.nextInt();
		for(i=2;i<=num/i;i++)
		{
			if(num%i==0)
				c=1;
			break;
		}
		if(c==0)
			System.out.println("it is prime number");
		else
		System.out.println("it is not prime number");
	}
}
