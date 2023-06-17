package LoopingStatement;

//Q ] write a program to print no of iterations add all numbers  using while loop ?
import java.util.*;
class  WhileLoop2
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int no=0,sum=0;

		while (no>=0)
		{
			System.out.print("ENTER NEW NUMBER IS :");
			no=sc.nextInt();
			
			sum+=no;
		}		
		System.out.println("THE SUM IS : "+sum);
	}
}
