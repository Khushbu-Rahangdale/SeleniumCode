package LogicalProg;

import java.util.Scanner;

public class evenOddProg {

	public static void main(String[] args) {
		int num;
		System.out.println("Even number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		System.out.println(" number =" + num);
		if(num%2==0)
		{
			
			System.out.println("even number");
		}
		else 
		{
			System.out.println("odd number");
		}
		

	}

}
