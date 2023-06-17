package ContrilStatement;

/*Q] Write a program to accept no from user.
Check whether it is divisable by 5 or 3 or both.? */

import java.util.*;
class  ControlDemo7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER IS :");
		double no=sc.nextDouble();
		condition(no);
	}
	static void condition(double no)
	{
		if (no%5==0 && no%3==0)
		{
			System.out.println("THE NO IS  DIVISIBLE BY 5 AND 3");
		}
		else if (no%3==0)
			{
				System.out.println("THE NO IS DIVISIBLE BY 3");
			}
		else if (no%5==0)
			{
				System.out.println("THE NO IS DIVISIBLE BY 5");
			}		
		else 
		{
			System.out.println("THE NO IS NOT DIVISIBLE BY 5 AND 3");
		}
   }
}
