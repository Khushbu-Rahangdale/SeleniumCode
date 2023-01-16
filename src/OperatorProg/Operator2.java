package OperatorProg;

public class Operator2 {

	public static void main(String[] args) {
		int a=10,b=40;
		double c=57.76,d=6.98;
		char operator = '/';
	
		switch(operator)
		{
		case '+':
			System.out.println("addition is" + (a+b));
			break;
		case '-':
			System.out.println("substraction is " + (a-b));
			break;
		case '*':
			System.out.println("multipilcation is " + (a*b));
			break;
		case '/':
			System.out.println("divide is " + (c/d));
			break;
			default:
				System.out.println("Invalid Input");
		
			
			
		}
		
		
			
		
	
		}

	}


