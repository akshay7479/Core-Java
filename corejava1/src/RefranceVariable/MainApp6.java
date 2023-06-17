package RefranceVariable;
//Q] Write a program to access Non-static member of a class by using refrance variable?
	//Business logic class
class Demo1
{
	int a=10;
	int b=20;
}
//Executable class
class MainApp6
{
	public static void main(String[] args)
	{
		//First Object--->First copy
		Demo1 d1=new Demo1();
		System.out.println("A: "+d1.a);
		System.out.println("A: "+d1.b);
		System.out.println(d1);

		//Second object--->Second copy
		Demo1 d2=new Demo1();
		System.out.println(d2);
	}
}	