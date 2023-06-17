package ContrilStatement;

/*Write a program to accept a number from user check whether it is even or odd. 
If it is even make a square.
If it is odd make a cube and display output.*/
import java.util.*;
class  ControlDemo2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER IS: ");
		int num=sc.nextInt();
		condition(num);
	}
	static void condition(int num)
	{
		if(num%2==0)
		{
			int square=num*num;
			System.out.println("THE NUMBER IS EVEN AND SQUARE IS : "+square);
					}
		else
		{
			int cube=num*num*num;
			System.out.println("THE NUMBER ID ODD AND CUBE IS : "+cube);
		}
	}
}
	