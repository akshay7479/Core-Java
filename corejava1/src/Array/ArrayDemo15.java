package Array;

//write a program to merge elements from two diffrance array into single array nad print final output ?
import java.util.*;
class ArrayDemo15 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("ENTER 1ST ARRAY ELEMENTS IS :");
		int [] arr1 = new int[4];    

		for (int i=0;i<arr1.length;i++)
		{
		   arr1[i]=sc.nextInt();
		}

		System.out.println("ENTER 2nd ARRAY ELEMENTS IS :");
		int [] arr2 = new int[4];
		for (int i=0;i<arr2.length;i++)
		{
		   arr2[i]=sc.nextInt();
		}

		int [] arr3= new int[8];
		        for (int i=0;i<arr1.length;i++ )
		{
		 arr3 [i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
            arr3[arr1.length+i] = arr2[i];
        }
         System.out.println("THE TOTAL ELEMENTS OF ARRAY IS :");
		//print statement
		for(int i=0;i<arr3.length;i++)
		{
            System.out.println(arr3[i]);
        }
	}
}
