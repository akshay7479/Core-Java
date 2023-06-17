package RefranceVariable;
//Q] Write a program to access Non-static member of a class by using refrance variable?
//Business logic class
class Demo	{
		int a=10;
		int b=20;
	}
	//Executable class
class MainApp1 {
	public static void main(String[] args)		{
		//First Object--->First copy
		Demo d1=new Demo();
		System.out.println("A: "+d1.a);
		System.out.println("A: "+d1.b);
		System.out.println(d1);

		//Second object--->Second copy
		Demo d2=new Demo();
		System.out.println(d2);		
		}
	}	

	