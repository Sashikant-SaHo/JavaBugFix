class Product 
{
	private int id;
	private String name;
	private	 float price;
	void setProduct(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void printProduct()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	} }
	class Test5
	{
	public static void main(String[] args) 
	{
		Product prod1=new Product();
		Product prod2=new Product();
		prod1.setProduct(101,"mouse",300f);
		prod2.setProduct(102,"keyboard",500f);
		prod1.printProduct();
		prod2.printProduct();
	}  
}
