package Block;

//Business Logic Class
class  BlockDemo1
{
	//static block
	static
	{
		System.out.println("STATIC BLOCK");
	}
	public static void main(String[] args) 
	{
		System.out.println("MIAN METHOD");

		BlockDemo1 d1= new BlockDemo1();
		BlockDemo1 d2= new BlockDemo1();
		BlockDemo1 d3= new BlockDemo1();
	}
     //non_static block
	{
		System.out.println("NON-STATIC BLOCK");	
	}
}

