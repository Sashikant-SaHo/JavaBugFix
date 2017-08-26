class StringBufferTest1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		sb.append("java");
		sb.append("language");
		sb.insert(4," ");
		System.out.println(sb);
	}
}
