package String;

//Q ] write a program to prove that String is immutable in natuer ?
class StringDemo6 
{
	public static void main(String[] args) 
	{
		String s1 = "JAVA";
		String s2 = "JAVA";
				
		System.out.println(s1 ==s2);

		//reinitilize s1
		s1 = s1 + "J2EE";
		System.out.println(s1 ==s2);
	}
}
