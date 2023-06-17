package Members;

//Q] Write a program to determine Non-static member utilization ?

//Business logic class
class Sample
{
	//Data Members
	 int k=25;
	//Function Member
	void info()
	{
		System.out.println("TEST METHOD ");
	}
}
//Executable Class
class  MainApp2
{
	public static void main(String[] args) 
	{
		System.out.println("MAIN METHOD ");
		System.out.println("THE VALUE OF K IS : "+new Sample().k);
		new Sample().info();
	}
}
