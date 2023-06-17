package String;

class StringDemo5
{
	public static void main(String[] args) 
	{
		// Constant Pool Area 
		String S1="JAVA";
		String S2="SQL";
		String S3="JAVA";

		// Non-Constant Pool Area 
		String str1 = new String ("SQL");
		String str2 = new String ("SQL");
		String str3 = new String ("JAVA");

		System.out.println(S1 == S2);
		System.out.println(S1 == S3);
		System.out.println(S2 == str1);
		System.out.println(str1 ==str2);
		System.out.println(S2.equals(str1));
		System.out.println(S3.equalsIgnoreCase(str3));
	}
}

