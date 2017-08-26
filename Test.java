class Test
{
	public static void main(String args[])
	{
		int i=5;j=1;
		while(i>=1)
		{
			
			while(j<=5)
			{
				if(i>=j)
					System.out.printf("%3d",j);
				j=j+1;
			}
			System.out.println();
			i=i-1;j=1;
		}
	}
}