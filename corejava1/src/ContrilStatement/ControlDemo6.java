package ContrilStatement;

/*Write a program to accept marks of 5 subjects from user and calculate total  marks as  well as percentage.
Display total marks ,percentage and grade of student.
Following is the criteria to calculate grade.
1) If percentage is greater than 80 then Grade A.
2) If percentage is greater than 70 then Grade B
3) If percentage is greater than 60 then Grade C.*/
import java.util.*;
class  ControlDemo6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER UR 1ST NIMBER IS :");
		double n1=sc.nextDouble();
		System.out.println("ENTER UR 2ND NIMBER IS :");
		double n2=sc.nextDouble();
		System.out.println("ENTER UR 3RD NIMBER IS :");
		double n3=sc.nextDouble();
		System.out.println("ENTER UR 4TH NIMBER IS :");
		double n4=sc.nextDouble();
		System.out.println("ENTER UR 5TH NIMBER IS :");
		double n5=sc.nextDouble();
        calculation(n1,n2,n3,n4,n5);
	}
	static void calculation(double no1,double no2,double no3, double no4,double no5)
	{
		double total=no1+no2+no3+no4+no5;
		System.out.println("THE TOTAL MARK IS : "+total);
		double per=total/500*100;
		System.out.println("THE PERCENTAGE  IS : "+per);
		
		if(per>=80)
		{
			System.out.println("THE GRADE IS A ");
		}
		else if (per>=70)
		{
			System.out.println("THE GRADE IS B ");
		}
		else if (per>=60)
		{
			System.out.println("THE GRADE IS C ");
		}
		else 
		{
			System.out.println("THE GRADE IS E ");
		}
	}
}

