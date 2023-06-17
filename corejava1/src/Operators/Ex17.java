package Operators;
class Ex17{
public static void main(String[] args) 	{
		int a=6;
		int b=4;
		int c=2;
		int d;

		d=a++ +c-- + ++b + --a +c+b;

		if (a--<7)		{
			if (b++>5)	{
				a--;
				b--;
			}
		}
		else		{
			c++;
			b++;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
