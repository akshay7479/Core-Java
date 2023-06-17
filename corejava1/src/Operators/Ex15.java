package Operators;
class Ex15
{
public static void main(String[] args) 
	{
		int a=6;
		int b=4;
		int c;
		c=++a +b+ --b +a+ a++ + --a + b++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
