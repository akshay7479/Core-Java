package String;

import java.util.*;
class StringDemo3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR STRING IS : ");
		String str=sc.next();

		String newString=str.toLowerCase();
		char[] ch=newString.toCharArray();

		int count1=0;
		int count2=0;

		for (int i=0;i<ch.length;i++)
		{
			if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u')
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
        System.out.println("TOTAL NO OF VOVELS IS : "+count1);
		System.out.println("TOTAL NO OF CONSONANTS IS : "+count2);
	}
}
