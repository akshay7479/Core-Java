package Array;

import java.util.*;
class ArrayDemo2
 {
	public static void main(String[] args) 
	{
		// step 1 = Create reference of scanner
		Scanner sc=new Scanner(System.in);
		
		//  step 2 = accept total no of floors & flats
		System.out.print("ENTER TOTAL NO OF FLOORS IS :");
		int floors=sc.nextInt();
		System.out.print("ENTER TOTAL NO OF FLATS IS :");
		int flats=sc.nextInt();
        
		// step 3 = declaring array
		int appartment [][] =new int[floors] [flats];

		// step 4 = accept Flat & floor No from user
		//rows = floors
		System.out.println("ENTER  "+(floors+flats)+"  FLAT NUMBER IS :");
		for (int i=0;i<floors;i++)
		{
			//column = flats
			for (int j=0;j<flats;j++)
			{
				appartment[i][j]=sc.nextInt();
			}
		}
		sc.close();
		// step 5 = printing array
		for (int i=0;i<floors;i++)
		{
			System.out.println("FLOOR NO IS : "+(i+1));
			//column = flats
			for (int j=0;j<flats;j++)
			{
				System.out.print("FLAT NO IS :"+appartment[i][j]+"  ");
			}
			System.out.println();
			System.out.println("-----------------------------------------------");
		}		
	}
}

