package ThisKeyword;

public class Pro_3 {
	int a;
	int b;
	Pro_3(int a,int b)
	{
		this.a =a;
		this.b =b;
	}
	void display()
	{
		System.out.println("a="+a +" b=" +b);
	}
	

	public static void main(String[] args) {
		Pro_3 x= new Pro_3(12,15);
		x.display();
		
		

	}

}
