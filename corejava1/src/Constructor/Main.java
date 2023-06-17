package Constructor;

class Main 
{
	void Display()
	{
		System.out.println(this);
	}
	public static void main(String[] args) 
	{
		Main m1=new Main();
		System.out.println(m1);
		m1.Display();
	}
}
