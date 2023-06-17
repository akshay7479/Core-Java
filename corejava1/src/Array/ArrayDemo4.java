package Array;

class ArrayDemo4
{
	public static void main(String[] args) 
	{
		int [][][]data=new int[2][2][2];

		// enter 1st row
		data [0][0][0]=10;
		data [0][0][1]=20;
		data [0][1][0]=30;
		data [0][1][1]=40;

		// enter 2ND row
		data [1][0][0]=50;
		data [1][0][1]=60;
		data [1][1][0]=70;
		data [1][1][1]=80;
		
		//PRINTING ARRAY 
		// print row
		System.out.println("THE 3D ARRAY IS : ");
		for (int i=0;i<data.length;i++)
		{
			//print colummn
			for (int j=0;j<data.length;j++)
			{
				//panel printing
				for (int a=0;a<data.length;a++)
				{
					System.out.print(data[i][j][a]+"  ");
				}
			}
			System.out.println("");
		}		
	}
}

/*
OUTPUT=
THE 3D ARRAY IS :
10  20  30  40
50  60  70  80
*/