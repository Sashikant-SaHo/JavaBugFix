class StringTest8 
{
	public static void main(String[] args) 
	{
		String str="java";
		byte b[]=str.getBytes();
		System.out.println(str);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}
}
