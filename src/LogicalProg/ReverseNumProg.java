package LogicalProg;

import java.util.Scanner;

public class ReverseNumProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the humber =");
		int num=sc.nextInt();
	//	int Org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
