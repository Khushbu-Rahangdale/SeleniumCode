package LogicalProg;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value");
	int num = sc.nextInt();
	int a[]=new int[9];
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int v:a)
		System.out.println(v);
	

	}

}
