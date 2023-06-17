package Array;

//Q ] write a program to display an simple array format ?
class ArrayDemo8 
{
	public static void main(String[] args) 
	{
		//Decleration
		int[] data;

		//Sizw allowcation
		data=new int[5];

		//Initilization
		data[0]=10;
		data[1]=20;
		data[2]=30;
		data[3]=40;
		data[4]=50;

		//Print data
		for (int i=0;i<5;i++)
		{
			System.out.println("THE ARRAY IS :"+data[i]);
		}
	}
}

/*
OUTPUT=
THE ARRAY IS :10
THE ARRAY IS :20
THE ARRAY IS :30
THE ARRAY IS :40
THE ARRAY IS :50
*/