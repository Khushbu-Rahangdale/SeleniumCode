package OperatorProg;

public class Oprator_2 {

	public static void main(String[] args) {
		int a=4,b=5;
		char multiply = '/';
		switch (multiply)
		{
		case '+':
			System.out.println("addition="+(a+b));
			break;
		case '-':
			System.out.println("substraction="+(a-b));
			break;
		case'*':
			System.out.println("multiplication="+(a*b));
			break;
			default:
				System.out.println("it is invalid");
		}

	}

}
