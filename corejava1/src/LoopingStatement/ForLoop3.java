package LoopingStatement;
import java.util.Scanner;
public class ForLoop3
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
                int square=i*i;
                System.out.println(" THE ODD NUMBER IS : "+i+ "\t" +"THE SQUARE IS :" +square);
            }
        }
     }
    }
