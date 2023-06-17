package Array;

import java.util.*;
class ArrayDemo14
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		sc.close();
		productSimulator p1 =new productSimulator();
		System.out.println("SELECT PRODUCT IS : ");
		System.out.println("1: MOBILE");
		System.out.println("2: WATCH");
		System.out.println("3: TV ");

        System.out.println("TOUR CHOICE IS : ");
		int choice=sc.nextInt();
		System.out.print("ENTER NO OF QUANTITY IS :");
		int count=sc.nextInt();

		p1.calculateBill(choice, count);
	}
}
class productSimulator
{
	String [] product ={"MOBILE","WATCH","TV"};
	Double [] price={15000.25,5000.25,30000.50};
	int [] stock = {50,100,20};
		
		void calculateBill(int choice,int count)
		{
			boolean status=false;
			for (int i=1;i<product.length;i++)
			{
				if (choice==i && count <=stock[i])
				{
					// calculate total amount by featching the price 
					double total=count*price[i];
					System.out.println("THE TOTAL AMOUNT IS : "+total);

					//update the stock
					stock[i]-=count;
					System.out.println("THE UPDATED STOCK IS : "+stock[i]);	
					status= true;
				}
			}
			if (status==false)
			{
				System.out.println("THE PRODUCT NOT FOUNT OR OUT OF STOCK ");
			}
		}
}

/*
OUTOPUT= 
SELECT PRODUCT IS :
1: MOBILE
2: WATCH
3: TV
TOUR CHOICE IS :
1
ENTER NO OF QUANTITY IS :5
THE TOTAL AMOUNT IS : 25001.25
THE UPDATED STOCK IS : 45


SELECT PRODUCT IS :
1: MOBILE
2: WATCH
3: TV
TOUR CHOICE IS :
1
ENTER NO OF QUANTITY IS :102
THE PRODUCT NOT FOUNT OR OUT OF STOCK
*/