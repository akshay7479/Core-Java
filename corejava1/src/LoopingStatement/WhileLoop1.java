package LoopingStatement;

//Q ] write a program to print no of iterations using while loop ?
import java.util.*;
class  WhileLoop1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int no=0;

		while (no>=0)
		{
			System.out.print("ENTER NEW NUMBER IS :");
			no=sc.nextInt();
			System.out.println("THE NUMBER IS : "+no);
		}		
	}
}
