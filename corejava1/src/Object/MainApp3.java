package Object;

import java.util.*;
class Ticket{
	 static int availableTicket=20;
	 static double ticketCost=150;
	 static double gst=0.18;

	 void bookTicket(int ticketCount)	{
		if (ticketCount<=availableTicket)		{
			double total=ticketCount*ticketCost;
			double finalAmt=total+total*gst;
			System.out.println("TICKET BOOKED SUCCESSFULLY"+ticketCount);
			availableTicket=availableTicket-ticketCount;
		    System.out.println("TOTAL AMOUNT TO BE PAID IS :"+finalAmt);
			checkAvailableTicket();
		}
		else	{
			System.out.println("TICKETS ARE NOT AVAILABLE");
			checkAvailableTicket();
		}
	}

	void checkCancleTicket(int ticketCount)
	{
		availableTicket=availableTicket*ticketCount;
		System.out.println("TICKETS CANCLED SUCCESSFULLY "+ticketCount);
	}

	void checkAvailableTicket()
	{
		System.out.println("AVAILABLE TICKETS ARE "+availableTicket);
	}
}
class MainApp3{
	public static void main(String[] args) 	{
		Scanner sc=new Scanner(System.in);
		Ticket t1=new Ticket();

   		System.out.println("SELECT OPTION IS : ");
		System.out.println("1:BOOK TICKET \n 2:CANCLE TICKET \n 3:AVAILABLE TICKET ");
        int choice=sc.nextInt();

		if (choice==1)		{
			System.out.println("ENTER NUMBER OF TICKETS IS : ");
			int count=sc.nextInt();
			t1.bookTicket(count);
		}
		else if (choice==2)		{
			System.out.println("ENTER NUMBER OF TICKETS IS : ");
			int count=sc.nextInt();
			t1.checkCancleTicket(count);
		}
		else if (choice==3)		{
			t1.checkAvailableTicket();
		}
		else		{
			System.out.println("INVALID CHOICE ");
		}
	}
}

