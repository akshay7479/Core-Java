package Block;

class StaticBlockDemo1 
{
	static
	{
		System.out.println("STATIC BLOCK 1");
	}
	public static void main(String[] args) 
	{
		System.out.println("MAIN METHOD");
	}

	static 
	{
	  System.out.println("STATIC BLOCK ");	
	}
}

/*
OUTPUT=
STATIC BLOCK 1
STATIC BLOCK
MAIN METHOD
*/