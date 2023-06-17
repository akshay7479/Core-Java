package Constructor;

//Q ] Write a program to demonstrate a constructor overloading ?

class Laptop
{
	String company;
	int ramsize;
	double graphicSize;
	
	Laptop(String company,int ramsize , double graphicSize)
	{
		this.company=company;
		this.ramsize=ramsize;
		this.graphicSize=graphicSize;
	}
	 
	 Laptop(String company,int ramsize )
	{
		this.company=company;
		this.ramsize=ramsize;
		}

	void display()
	{
		System.out.println(company+"\t"+ramsize+"\t"+graphicSize);
	}
}

class MainApp6
{
	public static void main(String[] args) 
	{
		Laptop l1 =new Laptop("HP",4,2);
		l1.display();
		Laptop l2 =new Laptop("DEAL",6);
		l2.display();

	}
}

