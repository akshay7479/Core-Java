package Array;

//Q ] write a program to display an sum of all array numbers and calculate avrage of the array sum ?
class  ArrayDemo10
{
	public static void main(String[] args) 
	{
		int[] data=new int[5];

		data[0]=10;
		data[1]=20;
		data[2]=30;
		data[3]=40;
		data[4]=50;

		int sum=0,avg=0;

		for (int i=0;i<=4;i++)
		{
			System.out.println("THE ARRAY IS : "+data[i]);	
			sum=sum+data[i];
		}
		System.out.println("THE SUM IS : "+sum);
		avg= sum/5;
		System.out.println("THE AVRAGE IS : "+avg);
	}
}

