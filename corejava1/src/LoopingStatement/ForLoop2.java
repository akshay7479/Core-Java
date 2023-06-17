package LoopingStatement;
// write program to accept start point and end point from user and print all the odd numbers present within Reverse orderd ?
import java.util.Scanner;

public class ForLoop2
	{
    public static void main(String[] args)
		{
        Scanner sc = new Scanner(System.in);
        System.out.print("START NUMBER IS :");
        int start =sc.nextInt();
        System.out.print("END NUMBER IS :");
        int end =sc.nextInt();

        for (int i=start;i>=end;i--)
        {
            if (i%2!=0)
            {
                System.out.println(" THE ODD NUMBER IS : "+i);
            }
        }
    }
}
