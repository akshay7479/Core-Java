package Array;

// Q] Write a program to display simple array literal format ?
class ArrayDemo12

{
	public static void main(String[] args) 
	{
		int [] arr={10,20,30,40,50};
        System.out.println("THE ARRAY IS : ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

/*
OUTPUT=
THE ARRAY IS :
10
20
30
40
50
*/
