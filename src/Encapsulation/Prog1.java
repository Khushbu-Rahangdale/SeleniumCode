package Encapsulation;

public class Prog1 {
	private double salaryofEmp; //(in this we hide the data by using private keyword it access only for
	//that class)
	public  void setSalary(double salary)
	{
		salaryofEmp = salary;
		
	}
	public void getSalary()
	{
		System.out.println("slary of employee ="+ salaryofEmp);
		
	}

	public static void main(String[] args) {
		Prog1 x= new Prog1();
		x.getSalary();
		x.setSalary(5480.7);
		x.getSalary();
		

	}

}
