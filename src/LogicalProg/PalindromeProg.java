package LogicalProg;

import java.util.Scanner;

public class PalindromeProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String =");
		String str=sc.next();
		String str2=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str2.equals(rev))
		{
			System.out.println("is palidrome string"+str);
		}
		else
		{
			System.out.println("is not palidrome string "+str);
		}
	}

}
