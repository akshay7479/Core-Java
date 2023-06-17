package Block;

//Business Logic Class
class  BlockDemo2
{
	static int a=10;
	static int b=20;
	//static block
	static
	{
		System.out.println("A + B IS :"+(a+b));
		b++;
	}
	 //non_static block
	{
		System.out.println("A + B IS :"+(a+b));
		a++;
	}
	public static void main(String[] args) 
	{
		System.out.println("MIAN METHOD");

		BlockDemo2 d1= new BlockDemo2();
		BlockDemo2 d2= new BlockDemo2();

		System.out.println("A  VALUE IS :"+a);
		System.out.println("B  VALUE IS :"+b);
	}
}

/*
OUTPUT=
A + B IS :30
MIAN METHOD
A + B IS :31
A + B IS :32
A  VALUE IS :12
B  VALUE IS :21

*/