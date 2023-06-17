package ScannerCalss;

//Q]Write a program to accepts 3 numbers from enduser and perform addition & multiplication by using external methods ?
import java.util.Scanner;
class ScannerDemo4
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
         
         ScannerDemo4 s1=new ScannerDemo4();
		 s1.addition(d1,d2,d3);
		 s1.multiplication(d1,d2,d3);
		 
	}
	   //external Addition method
	 double addition(double no1,double no2,double no3)
	{
		double result1=no1+no2+no3;
		System.out.println("THE ADDITION IS : "+result1);
		return result1;
	}
	 //external Multiplication method
	 double multiplication(double no1,double no2,double no3)
	{
		double result2=no1*no2*no3;
		System.out.println("THE MULTIPLICATION IS : "+result2);
		return result2;
	}
}
