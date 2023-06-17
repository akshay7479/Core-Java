package Operators;
class Ex16{
public static void main(String[] args) 	{
		int a=4;
		int b;
		b=--a + a++ +a+ a++;
		if (a--<10)	{
			a++;
			b--;
		}
		else 		{
			a--;
			b++;
		}
		System.out.println(a);
		System.out.println(b);		
	}
}
