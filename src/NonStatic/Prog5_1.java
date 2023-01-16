package NonStatic;

public class Prog5_1 {

	public static void cubeformula(int a, int b) {
		int c=0;
		c=(a+b)*(a*a+a*b+b*b);
		System.out.println("Formula for cube = "+c);
		
	}
	public static void main(String[] args) {
		cubeformula(2,1);
	}

}
