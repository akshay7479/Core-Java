package ScannerCalss;

//Q]Write a program to accepts 3 numbers from enduser and perform addition & multiplication by using external methods ?
import java.util.Scanner;
class ScannerDemo3
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER IS :");
        double d1=sc1.nextDouble();
		System.out.println("ENTER THE SECOND NUMBER IS :");
        double d2=sc1.nextDouble();
		System.out.println("ENTER THE THIRD NUMBER IS :");
		double d3=sc1.nextDouble();
         
		double add=addition(d1,d2,d3);
		double mul=multiplication(d1,d2,d3);

		System.out.println("THE ADDITION IS : "+add);
		System.out.println("THE MULTIPLICATION IS : "+mul);
	}
	   //external Addition method
	static double addition(double no1,double no2,double no3)
	{
		double result=no1+no2+no3;
		return result;
	}
	 //external Multiplication method
	static double multiplication(double no1,double no2,double no3)
	{
		double result=no1*no2*no3;
		return result;
	}
}
