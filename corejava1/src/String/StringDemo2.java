package String;

class StringDemo2
{
	public static void main(String[] args) 
	{
		String str = "MAHARASTRA";
		System.out.println("ENTERED STRING IS : "+str);

		char [] ch= str.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("==================");
		for (int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}
}

