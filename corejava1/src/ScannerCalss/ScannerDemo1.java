package ScannerCalss;

//Q] Write a program to print the string using scanner ?
import java.util.Scanner;

class ScannerDemo1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTHER YOUR NAME : ");

		String name=sc.next();  //simple one string print
     	System.out.println("WELCOME "+name);
	}
}

