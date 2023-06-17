package Operators;

//Q ] write a program to find no id EVEN or ODD using turnary Operator ?
import java.util.*;
class  Ex10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER YOUR NUMBER IS : ");
        int number =sc.nextInt();
		       
		String result=(number%2==0)?"EVEN":"ODD";
		System.out.println("THE SELECTED COLOUR IS "+result);
	}
}

