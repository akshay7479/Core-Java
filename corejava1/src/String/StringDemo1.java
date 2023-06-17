package String;

class StringDemo1 
{
	public static void main(String[] args) 
	{
		String str = "Core Java";
		System.out.println("ENTERED STRING IS : "+str);
		
		System.out.println(str.length());
		System.out.println(str.charAt(7));
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.contains("re"));
		System.out.println(str.startsWith("c"));
		System.out.println(str.endsWith("va"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(0,4));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

	}
}

