package Forloopprog;
public class Prog6 {
	public static void main(String[] args) {
		int remainder , sum=0 , a;
		int inputNumber=171;
		a=inputNumber;
		for(; a !=0; a/=10)
		{
			System.out.println("Input Number"+a);
			remainder= a%10;
			System.out.println("lastdigit"+remainder);
			System.out.println("digit"+remainder+" was added to sum "+(sum*10) );
			sum=(sum*10)+remainder;
			a=a/10;
		}
		if(sum==inputNumber)
			
			System.out.println("number is not palindrome");
		else
			System.out.println("number is  palindrome");
			}

}
