package StaticProg;

public class Parameter3 {
	public static void add() {
		int a=3, b=4,c=0;
		c=a+b;
		System.out.println("addition of 2 number="+c);
		
	}

	public static void sum(int a, int b) {
		int sum=0;
		sum=a+b;
		System.out.println("I in static method in parameter");
		System.out.println("addition of two number="+sum);
		System.out.println();
	}
	public static void student(String name,int rollno, int std, char grade) {
		System.out.println("student name="+name);
		System.out.println("student rollno="+rollno);
		System.out.println("student class="+std);
		System.out.println("student grade="+grade);
		
	}
	public static void main(String[] args) {
		System.out.println("main method start");
		add();
		sum(100,200);
		student("khushbu",1,5,'a');
		System.out.println("Main method end");
		
	}

}
