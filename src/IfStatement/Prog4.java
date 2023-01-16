package IfStatement;

public class Prog4 {

	public static void main(String[] args) {
		int marks=80;
		if(marks>75)
		{
			System.out.println("Addimission is in grant ");
			if(marks>90) {
				System.out.println("No fees");
			}
			else
			{
				System.out.println("It take half fees");
			}
			
		}
		else
		{
			System.out.println("addimission is in non grant");
		}
	}

}
