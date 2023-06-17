package CallByValue;

class CallByValue 
{
	public static void main(String[] args) 
	{
		Demo.test(10);
	}
}

class Demo
{
	static void test(int a)
	{
		System.out.println("THE VALUE OF A IS : "+a);
	}
}

/*
OUTPUT=
THE VALUE OF A IS : 10
*/