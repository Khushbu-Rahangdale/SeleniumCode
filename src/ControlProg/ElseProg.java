package ControlProg;

public class ElseProg {

	public static void main(String[] args) {
		int marks = 100;
		if(marks>=40 && marks<60)
		{
			System.out.println("Student is passed in second class");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("student is passed in first class ");
		}
		else if(marks>=75 && marks<90)
			
		{
			System.out.println("student is passed with distinction");
		}
		else if(marks>=90 && marks<=100)
		{
			System.out.println("student is passed in marit");
		}
		else if(marks>100)
		{
			System.out.println("Invalid input");
		}
	}

}
