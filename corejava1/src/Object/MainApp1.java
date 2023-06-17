package Object;
class Qspider{
	//state--> characteristics
	int studentId=101;
	double tushaionFees=39000.50;
	String courseName="SOFTWERE DEVLOPER";
	boolean isComplited=true;
	long contactNo=82088912227l;

	//Behavior---->functionality
	void studentDetaild()	{
		System.out.println("DISPLAY STUDENT DETAILS");
	}
	void attendance()	{
		System.out.println("DISPLAY STUDENT ATTENDANCE");
	}
	void placement()	{
		System.out.println("DISPLAY STUDENT PLACED COMPANY");
	}
}
class MainApp1 {
	public static void main(String[] args) 	{
		Qspider q1=new Qspider();
		//access state
		System.out.println("STUDENT ID IS : "+q1.studentId);
		System.out.println("TUSHION FEE IS : "+q1.tushaionFees);
		System.out.println("COURSE NAME IS : "+q1.courseName);
	    System.out.println("JAVA IS COMPLITED : "+q1.isComplited);
		System.out.println("STUDENT CONTACT NUMBER IS : "+q1.contactNo);
        System.out.println("=============================");
		//access behavior
		q1.studentDetaild();
		q1.attendance();
		q1.placement();
	}
}

