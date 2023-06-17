package RefranceVariable;

class Product {
	int productId;
	String productName;
	double productPrise;

	void acceptDetails(int id,String name,double prise)
	{
		productId=id;
		productName=name;
		productPrise=prise;
	}
	void displayDetails()
	{
		System.out.println("PRODUCT ID IS : "+productId);
		System.out.println("PRODUCT NAME IS : "+productName);
		System.out.println("PRODUCT PRISE IS : "+productPrise);
	}
}
class MainApp2  
{
	public static void main(String[] args) 
	{
		Product p1=new Product();
		p1.acceptDetails(101,"MOBILE",15000.25);
		p1.displayDetails();

		Product p2=new Product();
		p2.acceptDetails(102,"LAPTOP",45000.25);
		p2.displayDetails();
	}
}
