package Array;

//Q ] write a program to display an  array in Forward & reverse format ?
class  ArrayDemo9
{
	public static void main(String[] args) 
	{
		double [] data=new double[5];
		data[0]=30.25;
		data[3]=45.25;

		// Forward tracking
		System.out.println("FORWORD TRACKING ARRAY IS : ");
		for (int i=0;i<=4;i++)
		{
			System.out.println(+data[i]);
		}

 	      System.out.println("========================================");

		// Reverse tracking
		System.out.println("FORWORD TRACKING ARRAY IS : ");
		for (int j=4;j>=0;j--)
		{
			System.out.println(+data[j]);
		}
	}
}
