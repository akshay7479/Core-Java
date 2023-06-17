package Constructor;

//Q ] Write a program to demonstrate constructor by using information of student ? 
class Student
{
	String studentName;
	long contactNo;
	double studentPercentage;

	//Expilicit Constructor
	Student(String name,long number ,double percentage)
	{
		studentName=name;
        contactNo=number;
	    studentPercentage=percentage;
	}
	void display()
	{
		System.out.println(studentName+"\t"+contactNo+"\t"+studentPercentage);
	}
}
class MainApp5 
{
	public static void main(String[] args) 
	{
		Student s1= new Student("AKSHAY",8208891227l,80.46);
		s1.display();

		Student s2= new Student("JEEVAN",9860129122l,70.60);
		s2.display();

	}
}

/*
OUTPUT=
AKSHAY  8208891227      80.46
JEEVAN  9860129122      70.6

Compiled from "MainApp5.java"
class MainApp5 {
  MainApp5();
  public static void main(java.lang.String[]);
}
*/