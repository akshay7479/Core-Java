package ContrilStatement;

/*Write a program to accept two numbers from user 
check the greatest number and display suitable message.
If both numbers are equal display message numbers are equal*/
import java.util.*;
class  ControlDemo3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR 1ST NUMBER IS :");
		int no1=sc.nextInt();
		System.out.println("ENTER YOUR 2ND NUMBER IS :");
		int no2=sc.nextInt();

		//int num=sc.nextInt();
		conditions(no1,no2);
		
	}
	static void conditions(int n1,int n2)
	{
		if(n1>n2)
		{
			System.out.println("THE NUMBER 1ST IS GREATER");
		}
		else if(n2>n1)
		{
			System.out.println("THE NUMBER 2ND IS GREATER");
		}
		
		else 
		{
			System.out.println("THE BOTH NO ARE EQUAL");
		}
	}
}

