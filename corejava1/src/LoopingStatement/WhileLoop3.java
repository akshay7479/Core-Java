package LoopingStatement;

//Q ] write a program to print sum of all odd numer when u give even no the iteration will be stop using while loop ?
import java.util.*;
class  WhileLoop3
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int no=0,sum=0;

		while (no%2==0)
		{
			System.out.print("ENTER ODD NUMBER IS : ");
			no=sc.nextInt();
			sum+=no;
		}
		System.out.println("THE SUM OF ODD NUMBERS IS : "+sum);
	}
}
