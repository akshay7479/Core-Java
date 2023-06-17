package Members;
/*write a program incriment emp sal of emp based on given details
for all HR's 35% incriment will be given
for all ADMIN's 15% incriment will be given
Accept existing sal from user and
calculate update sal based on givin criteria
*/
import java.util.*;
class Employee{
 static double hrpercentage=0.35;
 static double adminpercentage=0.15;
 
 void calculateSal(int type,double currentsal)	{
		double updatesal=0.0;
		if (type==1)		{
			updatesal=currentsal+currentsal*hrpercentage;
		}
		else if (type==2)		{
			updatesal=currentsal+currentsal*adminpercentage;
		}
		System.out.print("UPDATED SALARY IS :"+updatesal);
	}
}
class MainApp4 {
	public static void main(String[] args) 	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER EMPLOYEE SALARY IS :");
		double sal=sc.nextDouble();
        System.out.print("SELECT EMPLOYEE TYPE:");
		System.out.println("1:HR \n 2:ADMIN");
		int choice=sc.nextInt();
		new Employee().calculateSal(choice,sal);
	}
}
