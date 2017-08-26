class StringTest16 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		sb.append("java Language");
		System.out.println(sb);
		sb.delete(0,5);
		System.out.println(sb);
	}
}
