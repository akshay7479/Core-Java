package Constructor;

class Master
{ 
	//Constructor 
	Master()
	{
		System.out.println("CONSTRUCTOR OF MASTER");
	}
	// Static Block
	static
	{
		System.out.println("STATIC BLOCK");
	}
	// Non-tatic Block
	{
		System.out.println("NON-STATIC BLOCK");
	}
 	// Display Method
	void info()
	{
		System.out.println("INFO METHOD");
	}
}
class  MainApp3
{
	public static void main(String[] args) 
	{
		Master m1 = new Master();
		m1.info();
		
		System.out.println("MAIN METHOD");
	}
}
