package Block;

class StaticBlockDemo2 
{
	static int a=65;
	static int b=70;

	static
	{
		System.out.println("STATIC BLOCK 1 IS : "+(a+b));
	}
	static
	{
		a=40;
		System.out.println("STATIC BLOCK 2 IS : "+(a+b));
	}
	public static void main(String[] args) 
	{
		System.out.println("MAIN METHOD");
	}
}


/*
OUTPUT=
STATIC BLOCK 1 IS : 135
STATIC BLOCK 2 IS : 110
MAIN METHOD

*/