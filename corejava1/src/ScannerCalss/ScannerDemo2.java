package ScannerCalss;

//Q] Write a program to print the ALL string using scanner ?
import java.util.Scanner;

class ScannerDemo2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME : ");

        String name1=sc.nextLine();  //ALL string print
		System.out.println("WELCOME "+name1);
	}
}

