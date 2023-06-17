package Block;

//business logic class
class Centrol
{
	static double d=10.25;

	static
	{
		d=35.25;
	}

	static
	{
		d=45.25;
	}

	static
	{
		double d=50.25;
		System.out.println("THE D VALUE IS : "+d);
	}
}
class  StaticBlockDemo3
{
	public static void main(String[] args) 
	{
		System.out.println("MIAN METHOD");
		System.out.println("THE D VALUE IS : "+Centrol.d);
	}
	static
	{
		System.out.println("STATIC BLOCK OF MAIN");
	}
}


/*
OUTPUT=
STATIC BLOCK OF MAIN
MIAN METHOD
THE D VALUE IS : 50.25
THE D VALUE IS : 45.25

*/