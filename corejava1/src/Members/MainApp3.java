package Members;
import java.util.Scanner;
//Business logic class
class ElectronicShop
{
	//Data Members
	static double mobileCost=20000.50;
	static double laptopCost=50000.50;
    
	//function Members
	void mobileBill(int qty)
	{
		double total=qty*mobileCost;
		System.out.println("TOTAL MOBILE BILLING IS :"+total);
	}
	void laptopBill(int qty)
	{
		double total=qty*laptopCost;
		System.out.println("TOTAL LAPTOP BILLING IS :"+total);
	}
}
class MainApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER QUNTITY IS :");
		int qty=sc.nextInt();
		System.out.println("SELECT PRODUCT TYPE IS :");
		System.out.println("1:MOBILE \n2:LAPTOP");
		int type=sc.nextInt();

		if (type==1)
		{
			new ElectronicShop().mobileBill(qty);
		}
		else if(type==2) 
		{
			new ElectronicShop().laptopBill(qty);
		}
		else
		{
			System.out.println("INVALID CHOICE");
		}
	}
}

