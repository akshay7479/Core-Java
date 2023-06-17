package Constructor;

//Q ] Write a  program to Demonstrate flow of execute if java class contains static ,Non-static block & constructor ?

//Business Logic Class
class Product
{
	int productId;
	String productName;
	double productPrice;

	//Explicit Constructor
	Product(int id,String name,double price)
	{
		productId=id;
		productName=name;
		productPrice=price;
	}
	void display()
	{
		System.out.println(productId +"\t"+ productName+"\t"+ productPrice);
	}
}
class MainApp4  
{
	public static void main(String[] args) 
	{
		Product p1= new Product(101,"AC",45000.25);
		p1.display();

        Product p2= new Product(102,"TV",25000.25);
		p2.display();

	}
}

/*
OUTPUT=
101     AC      45000.25
102     TV      25000.25

Compiled from "MainApp4.java"
class MainApp4 {
  MainApp4();
  public static void main(java.lang.String[]);
}
*/