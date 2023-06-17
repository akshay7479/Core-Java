package Block;

class BlockDemo 
{
	public static void main(String[] args) 
	{
		BlockDemo m1 =new BlockDemo();
		System.out.println("main method");
	}

	public BlockDemo()
	{
		System.out.println("CONSTRUCTOR");
	}

	static
	{
		System.out.println("STAIC BLOCK");
	}

	{
		System.out.println("NON- STATIC BLOCK");
	}
}

