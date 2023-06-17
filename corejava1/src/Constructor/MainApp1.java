package Constructor;

class Demo
{
	int num;
	String name;
     Demo( )
	{
		num=10;
		name = "AKSHAY NAVALE ";
	}
	void Display()
	{
		System.out.println("ENTER NO IS :  "+num);
		System.out.print("ENTER NAME  IS :  "+name);
	}
}
class MainApp1 
{
	public static void main(String[] args) 
	{
		Demo d1 =new Demo();
		d1.Display();
	}
}
