package ContrilStatement;

/*Write a program to accept product quantity and price from end user.
Calculate total amount.
If total is less than 1000 then 5% discount.
If total is greater than 1000 then 10% discount.
Display final amount.*/
import java.util.*;
class  ControlDemo4
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER YOUR QUANTITY IS :");
		double no1=sc.nextDouble();
        System.out.println("ENTER YOUR PRISE IS :");
		double no2=sc.nextDouble();
        conditions(no1 ,no2); 

	}
	static void conditions(double qtn, double prise)
	{
		double total=qtn*prise;
		System.out.println("THE TOTAL AMOUNT IS: "+total);

		if(total<=1000)
		{
			double result=total-total*0.5;
			System.out.println("THE 5% DISXOUNT ON FINAL AMOUNT IS : "+result);
		}
		else
		{
			double result=total-total*0.1;
			System.out.println("THE 10% DISXOUNT ON FINAL AMOUNT IS : "+result);
		}
	}
}
