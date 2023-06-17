package Array;

//Q ] write a program to display an array user inputs ?

import java.util.*;
class ArrayDemo11
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER YOUR ELEMENT IS : ");
		int size = sc.nextInt();
		sc.close();
		// Create an array 
		int [] data=new int[size];

		//accept variables
		System.out.print("THE VALUE  IS : ");
		for (int i=0;i<size;i++)
		{
			data[i]=sc.nextInt();
		}
		//print elements
		System.out.println("THE ARRAY IS : ");
		for (int i=0;i<size;i++)
		{
			System.out.println(data[i]);
		}
	}
}

