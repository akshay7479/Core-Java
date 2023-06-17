package LoopingStatement;// Q] Write a program to use of contineo statement ?
class Main2 {
  public static void main(String [] args)
  {
	  for(int i=1;i<=10;i++)
	  {
		  if(i==6)
		  {
			  continue;
		  }
		  System.out.println("THE NUMBER IS IS :"+i);
	  }
  }
 }
/*
OUTPUT=
THE NUMBER IS IS :1
THE NUMBER IS IS :2
THE NUMBER IS IS :3
THE NUMBER IS IS :4
THE NUMBER IS IS :5
THE NUMBER IS IS :7
THE NUMBER IS IS :8
THE NUMBER IS IS :9
THE NUMBER IS IS :10
 */