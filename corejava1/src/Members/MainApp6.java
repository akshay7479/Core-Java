package Members;
import java.util.Scanner;
class Vehical
{
    static double gstOfCar=0.18;
    static double gstOfBike=0.12;
    static double discountForPetrol=0.05;
    static double discountForElectric=0.08;

    static void calculate(double choice1,double choice2,double price)
    {
        if(choice1==1 && choice1==1)
        {
          double car1 = price+(price*gstOfCar)-(price*discountForPetrol) ;
          System.out.println("Car with Petrol "+car1);
		}  
        else if (choice1==1 && choice1==2)
         {
           double car2 = price+(price*gstOfCar)-(price*discountForElectric);
           System.out.println("Car with Electric "+car2);
         }
		else if(choice2 ==1 && choice2==1)
        {
            
          double bike1 = price +(price*gstOfBike)-(price*discountForPetrol) ;
          System.out.println("bike with Petrol "+bike1);
		}  
        else if (choice2 ==2 && choice2==2)
         {
          double bike2 = price +(price*gstOfBike)-(price*discountForElectric);
           System.out.println("bike with Electric "+bike2);
         }
	     else 
            {
                System.out.println("Invalid choice");
            }
    }
}	
class MainApp6
{
    public static void main (String[]args)
    {
        Scanner s1 = new Scanner (System.in);
        System.out.println("Price of Vehicle");
        double price = s1.nextDouble();

        System.out.println("1:Vehicle is Car \n2:Vehicle is Bike ");
		System.out.print("YOUR CHOICR IS :");
        double choice1= s1.nextDouble();
		
        System.out.println("1:Petrol \n2:Electric ");
		System.out.print("YOUR CHOICR IS :");
        double choice2= s1.nextDouble();

        new Vehical().calculate(choice1, choice2, price);
    }
}

