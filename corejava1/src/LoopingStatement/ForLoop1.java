package LoopingStatement;

import java.util.*;
class ForLoop1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER START NUMBER IS :");
		int start = sc.nextInt();
		System.out.print("ENTER END NUMBER IS :");
		int end = sc.nextInt();

		for (int i=start;i>=end ;i--)
		{
			System.out.println("THE NUMBER IS :"+i);
		}

	}
}
