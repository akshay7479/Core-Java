package LoopingStatement;

import java.util.Scanner;

public class ForLoop4
	{
    public static void main(String[] args) 
		{
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER START NUMBER IS : ");
        int no1= sc.nextInt();
        System.out.print("ENTER END NUMBER IS : ");
        int no2= sc.nextInt();

        for (int a=no1;a>=no2;a--)
        {
            if ( a %2!=0)
            {
                System.out.print("ODD NO IS :"+a);
                int cube= a*a*a;
                System.out.println("\t THE CUBE IS :"+cube);
            }
        }
    }
}

