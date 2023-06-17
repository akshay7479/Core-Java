package Array;

// Q] write a program to gives name from user and print the name ?
import java.util.*;
class ArrayDemo6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER YOUR ELEMENT IS : ");
		int name= sc.nextInt();

         //create array
		String [] data=new String[name];

          // user inputs
		System.out.println("ENTER YOUR NAMES IS : ");
		for (int i=0;i<name;i++)
		{
			 data[i]=sc.next();
		}
         System.out.println("----------------------------");

		//printing original array
			for (int i=0;i<name;i++)
		{
			 System.out.println("WELCOME "+data[i]);
		}
			sc.close();
	}
}

