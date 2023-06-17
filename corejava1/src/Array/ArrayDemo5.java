package Array;

/* Q ] Write a program to accept element from user and store into array. 
calculate the square of every array element present 
inside the array & store the output into 2nd array .
finally print all the default and square array ? */

import java.util.*;
class ArrayDemo5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER YOUR ELEMENT IS : ");
		int size= sc.nextInt();
		sc.close();
         //create array
		int[] data=new int[size];

          // user inputs
		System.out.println("ENTER YOUR VALUE IS : ");
		for (int i=0;i<size;i++)
		{
			 data[i]=sc.nextInt();
		}

		//printing default array
		System.out.println("ENTER YOUR VALUE IS : ");
		for (int i=0;i<size;i++)
		{
			 System.out.println(data[i]);
		}

		//square array
		int[] square=new int[size];
		System.out.println("THE SQUARE ARRAY  IS : ");
		for (int i=0;i<size;i++)
		{
			square[i]=data[i]*data[i];
		}

		for (int i=0;i<size;i++)
		{
			System.out.println(square[i]);
		}
	}
}

