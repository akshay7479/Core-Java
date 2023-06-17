package RefranceVariable;
//write a program to prove that static members are having single copy and nonstatic membershaving multiple copys ?
class Master
{
	static int k=25;
	       int j=50;
}
class MainApp4
{
	public static void main(String[] args) 
	{
		//first copy
		Master m1=new Master();
        System.out.println("K: "+Master.k);
		System.out.println("J: "+m1.j);
		Master.k=100;
		m1.j=200;
		System.out.println("K: "+Master.k);
		System.out.println("J: "+m1.j);
		
		//second copy
		Master m2=new Master();
		  System.out.println("K: "+Master.k);
		System.out.println("J: "+m2.j);
	}
}
