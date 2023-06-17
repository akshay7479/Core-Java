package Array;

class  ArrayDemo7
{
	static int [] printArray()
	{
		int [] arr=new int [5];

		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		return arr; 
	}
	public static void main(String[] args) 
	{
		int[] arr1=printArray();

		System.out.println("THE FINAL ARRAY IS : ");
		for (int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
