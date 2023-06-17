package ContrilStatement;

/*Q] Write a program to accept number from user and check whether it is divisable by 5 or not.
If it is divisable by 5 check it is positive or negative.
Display suitable message? */
import java.util.*;
class  ControlDemo5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER IS :");
		double num=sc.nextDouble();
        condition( num);
	}
	static void condition(double num)
	{
		if(num%5==0)
		{
			if (num>0)
			{
				System.out.println("THE NUMBER IS POSITIVE AND DIVISIBLE BY 5");
			}
			else
			{
				System.out.println("THE NUMBER IS NEGATIVE NOT DIVISIBLE BY 5 ");
			}
		}
		else
		{
			System.out.println("THE NUMBER IS NOT DIVISIBLE BY 5");
		}
	}
}

