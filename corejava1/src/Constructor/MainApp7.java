package Constructor;

//Q ] write a program to demonstrate constructor overloading ?
class Bus
{
	String company;
	int capacity;
	double weight;
	Bus (String company,int capacity)
	{
		this.company= company;
		this.capacity = capacity;
	}

	Bus (String company,int capacity,double weight)
	{
		this.company= company;
		this.capacity = capacity;
		this.weight= weight;
	}

	void Display()
	{
		System.out.println(company+"\t"+capacity+"\t"+weight);
	}
}
class MainApp7
{
	public static void main(String[] args) 
	{
		Bus b1= new Bus("THAR",17, 1000.30);
		b1.Display();

		Bus b2= new Bus("LAMBORGINI",15, 30000.30);
		b2.Display();
	}
}

/*
OUTPUT =
THAR    17      1000.3
LAMBORGINI      15      30000.3

Compiled from "MainApp7.java"
class MainApp7 {
  MainApp7();
  public static void main(java.lang.String[]);
}


*/