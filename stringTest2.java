class StringTest2 
{
	public static void main(String[] args) 
	{
		String s1="java";
		String s2="java";
		boolean b1=s1==s2;
		String s3=new String("php");
		String s4=new String("php");
		boolean b2=s3==s4;
		System.out.println(b1);
		System.out.println(b2);
	}
}
