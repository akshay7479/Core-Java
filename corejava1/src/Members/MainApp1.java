package Members;
//Q] Write a program to determine static member utilization ?
//Business logic class
class Demo
{
	//Data Members
	static int k=25;
	//Function Member
    static void test()
	{
		System.out.println("TEST METHOD ");
	}
}
//Executable Class
class  MainApp1
{
	public static void main(String[] args) 
	{
		System.out.println("MAIN METHOD ");
		System.out.println("THE VALUE OF K IS : "+Demo.k);
		Demo.test();
	}
}
