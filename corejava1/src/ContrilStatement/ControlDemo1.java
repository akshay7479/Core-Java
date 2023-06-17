package ContrilStatement;

//Write a program to accept age from user and check the eligibility for voting.
import java.util.Scanner;
class  ControlDemo1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YOUR AGE IS :");
		int age=sc.nextInt();
        voting(age);
	}
	static void voting(int age)
	{
		if(age>=18)
		{
		System.out.println("YOU ARE ELIGIBLE FRO VOTING");
		}
		else
		{
		System.out.println("YOU ARE NOT ELIGIBLE FRO VOTING");
		}
	}
}
 