package Encapsulation;

public class Prog1_1 {
	private int empid;
	public void setempid(int a)
	{
		 empid=a;
	}
	public void getempid()
	{
		System.out.println("id="+empid);
	}

	public static void main(String[] args) {
		Prog1_1 x=new Prog1_1();
		x.getempid();
		x.setempid(45);
		x.getempid();

	}

}
