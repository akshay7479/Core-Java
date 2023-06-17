package BitwiseOperators;
class  Ex3
{
	public static void main(String[] args) 
	{
		int x=13;
		int y=19;
		int a= x & y;
		int b= x | y;
		int c= a | b;
		
		System.out.println("THE VALUE OF A IS "+a);
		System.out.println("THE VALUE OF B IS "+b);
		System.out.println("THE VALUE OF C IS "+c);
	}
}

/*
OUTPUT=
THE VALUE OF A IS 1
THE VALUE OF B IS 31
THE VALUE OF C IS 31
*/