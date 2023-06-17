package Array;

class ArrayDemo1
 {
	public static void main(String[] args) 
	{
		
		String [][] arr=new String[4][2];
		
		arr[0][0]="AKSHAY";
		arr[0][1]="Q SPIDER";

		arr[1][0]="ADVAIT";
		arr[1][1]="ATOS";

		arr[2][0]="NIRAJ";
		arr[2][1]="TCS";

		arr[3][0]="ABHIJJET";
		arr[3][1]="EGOF ENGG";


		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"      ");
			}
			System.out.println("");
		}
			
	}
}


