package Operators;

import java.util.*;
class  Ex9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("SELECT COLOUR IS : ");
		System.out.println("1:RED\n2:GREEN\n3:BLUE ");
        int choice=sc.nextInt();
		System.out.println("YOUR CHOICE IS : "+choice);
        
		String result=(choice==1)?"RED":(choice==2)?"GREEN":"BLUE";
		System.out.println("THE SELECTED COLOUR IS "+result);
	}
}
