package ObjectOrientedProg;

public class Oop1 {
	
	public void add() {
		int num1=20, num2=30,sum=0;
		sum=num1+num2;
		System.out.println("sum="+sum);
		
	}

	public static void main(String[] args) {
	
		Oop1 k= new Oop1();
		System.out.println("This is start of main method");
		k.add();
		System.out.println("This is end of main method");

	}

}
