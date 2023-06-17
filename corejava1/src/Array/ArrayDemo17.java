package Array;

class ArrayDemo17
{
	public static void main(String[] args) 
	{
		String str="JAVA_SQL_WEBTECH_PROGRAMMING_APTITUDE";
		System.out.println(str);

		String [] arr1=str.split("_");

		for (int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}

