package BitwiseOperators;
class  Ex5
{
	public static void main(String[] args) 
	{
		int a=11;
		int b;
		b=++a +a+ a++;
		int c = a | b;
		int d = a & b;
		System.out.println("B IS "+b);
		System.out.println("C IS "+c);
		System.out.println("D IS "+d);
	}
}

