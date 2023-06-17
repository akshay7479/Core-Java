package Block;

//Business Logic Class
class Facebook
{
	//non-static block
	{
		System.out.println("ACCOUNT CREATED");
		createProfile();
	}
	//method
	void createProfile()
	{
		System.out.println("PROFILE CREATED");
	}
}
//executable class
class  BlockDemo3
{
	public static void main(String[] args) 
	{
		System.out.println("MIAN METHOD");
		Facebook f1= new Facebook();
		Facebook f2= new Facebook();
		Facebook f3= new Facebook();

	}
}

/*
OUTPUT=
MIAN METHOD
ACCOUNT CREATED
PROFILE CREATED
ACCOUNT CREATED
PROFILE CREATED
ACCOUNT CREATED
PROFILE CREATED

*/