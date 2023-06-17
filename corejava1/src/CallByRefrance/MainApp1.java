package CallByRefrance;

class MainApp1 {
	public static void main(String[] args) 
	{
		Qspider Q1= new Qspider();
		Student s1 =new Student();
		Q1.result(s1);
	}
}
// 1st BUSINESS LOGIC CLASS
class Student{
	String course="JAVA";
	int attendance=42;
	boolean SQLComplited = true;
	long mobileNo=8208891227l;
	float percentage= 83.42f;
}
// 2ND BUSINESS LOGIC CLASS
class Qspider{
	void result(Student a1)
	{
	System.out.println("THE COURSE COMPILETES IS : "+a1.course);
	System.out.println("YOUR ATTENDANCE IS : "+a1.attendance);
	System.out.println("YOUR SQL IS COMPLITED OR NOT : "+a1.SQLComplited);
	System.out.println("YOUR MOBILE NO IS : "+a1.mobileNo);
	System.out.println("YOUR BTECH PERCENTAGE IS : "+a1.percentage);
	}
}

	