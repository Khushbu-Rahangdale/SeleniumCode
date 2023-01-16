package ArrayProg;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		int arraySize;
		System.out.println("Enter the array size");
		Scanner x =new Scanner(System.in);
		arraySize=x.nextInt();
		
		
		System.out.println("Size of array = "+arraySize);
		System.out.println();
		
		int marks[]=new int[arraySize];		
		
		System.out.println("Enter the element of array");
		
		for(int i=0;i<arraySize;i++)
		{
			marks[i]=x.nextInt();
				
		}
		System.out.print("Array values are"+"  ");
		for(int v:marks)
			System.out.print(v+" ");
//		

	}

}
