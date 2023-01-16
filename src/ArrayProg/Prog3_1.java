package ArrayProg;

import java.util.Scanner;

public class Prog3_1 {

	public static void main(String[] args) {

		int rainbow;
		System.out.println("enter rainbow letter size");
	
		Scanner x=new Scanner(System.in);
		rainbow=x.nextInt();
		System.out.println(rainbow+" ");
		int a[]=new int[rainbow];
		System.out.print("Enter no.");
		for(int i=0;i<=rainbow;i++)
	{
		a[i]=x.nextInt();
		
			
		}
		
	 
//			
		for(int v:a)
		
			System.out.print(v);
		
		
		
				

	}

}
