package Operators;
class Ex6 
{
	public static void main(String[] args) 
	{
		int p=10;
		int q;

		q=p++ +p+ --p + ++p;

		if ((p++>10 && --q>20)|| (++q>20 && --p>10))
		{
			p++;
		}
		else
		{
			q--;
		}
		System.out.println("THE VALUE OF P IS : "+p);
		System.out.println("THE VALUE OF Q IS : "+q);
	}
}
