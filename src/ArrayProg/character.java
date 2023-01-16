package ArrayProg;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the first letter");
		String first=x.nextLine();
		System.out.println("enter the second letter");
		String second=x.nextLine();
		System.out.println("enter the third letter");
		String third=x.nextLine();
		System.out.println("enter the four letter");
		String four=x.nextLine();
		System.out.println("enter the five letter");
		String five=x.nextLine();
		System.out.println("enter the six letter");
		String six=x.nextLine();
		System.out.println("enter the seven letter");
		String seven=x.nextLine();
		if((first=="R") && (second=="A") && (third=="I") && (four=="N") && (five=="B") && (six=="O") && (seven=="W"))
		{
			System.out.println("RAINBOW");
		}
		else
			System.out.println("wrong");
		

	}

}
