package Array;

/*Write a program to accept number from end user and
check whether the given array contain that no or not ?*/
import java.util.*;
class ArrayDemo16
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.print("ENTER YOUR NUMBER IS : ");
		int arr=sc.nextInt();


		int [] arr1={10,20,30,40,50};
		
		boolean status=false;
		for (int i=0;i<arr1.length;i++ )
		{
			if (arr==arr1[i])
			{
				System.out.println("THE NUMBERIS PRESENT : "+arr);
				status=true;
			}
		}
		if (status==false)
		{
			System.out.println("THE NUMBERIS NOT PRESENT");
		}
	}
}


