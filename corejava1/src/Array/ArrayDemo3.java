package Array;
class ArrayDemo3 
{
 public static void main(String[] args) {
		int [] [] data=new int[2][2];
		
		data [0][0]=100;
		data [0][1]=200;
		data [1][0]=300;
		data [1][1]=400;
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data.length;j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		} 
	}
}
