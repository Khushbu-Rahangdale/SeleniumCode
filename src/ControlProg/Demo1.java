package ControlProg;

public class Demo1 {

	public static void main(String[] args) {
		char operation ='/';
		double a=10, b=13;
		double c=0;
		switch(operation)
		{
		case '+':
			System.out.println("addition =" +(a+b));
			break;
		case '-':
			System.out.println("subtraction=" +(a-b));
			break;
		case '/':
			System.out.println("divide="+(a/b));
			break;
		
			default:
				System.out.println("holiday");
		}

	}

}
