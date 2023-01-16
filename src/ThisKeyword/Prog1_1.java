package ThisKeyword;

public class Prog1_1 {

	public Prog1_1()
	{
	
		System.out.println("zero parametarised");
	}
	public Prog1_1(int a)
	{
		this();
		System.out.println(" nonzero parametarised");
	}
	public static void main(String[] args) {
		 Prog1_1 x=new  Prog1_1(3);

	}

}
