package Array;

//Q] write a program to display the addition of two arrays and store element in another array ?
class ArrayDemo13
{
	public static void main(String[] args) 
	{
		int [] arr1={10,20,30,40,50};
		int [] arr2={10,20,30,40,50};

		int [] arr3=new int[arr1.length];

		for (int i=0;i<arr1.length;i++ )
		{
		 arr3[i]=arr1[i]+arr2[i];
		 System.out.println(arr3[i]);
		}	
	}
}

