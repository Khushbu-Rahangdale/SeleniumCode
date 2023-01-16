package ControlProg;

public class NestedIfProg {

	public static void main(String[] args) {
		String username="khushbu";
		String password = "Khushbu123456";
		if(username=="khushbu")
		{
			System.out.println("if username is correct then enter pwd");
			if(password=="Khushbu123456")
			{
				System.out.println("Login Succesful");
			}
			else
			{
				System.out.println("Incorrect password is Enter");
			}
		}
		
		

	}

}
