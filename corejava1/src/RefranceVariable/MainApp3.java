package RefranceVariable;

//business logic class
class Gmail
{
	void accessGmail(String device)
	{
		System.out.println("ACCESS GMAIL USING "+device);
	}
}

class MainApp3 
{
	public static void main(String[] args) 
	{
		//first copy
		Gmail g1=new Gmail();
		g1.accessGmail("LAPTOP");

		//same address will be copid
		Gmail g2=g1;
		g2.accessGmail("MOBILE");
			
		System.out.println(g1+ "\t" +g2);;
	}
}
