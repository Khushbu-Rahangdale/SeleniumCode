package LogicalProg;

public class sortThreeNum {

	public static void main(String[] args) {
		int a=34,b=44,c=22;
		System.out.println(a + " " + b + " " + c);
		if(a>b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		if(b>c)
		{
			int temp =b;
			b=c;
			c=temp;
					
		}
		if(a>b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		System.out.println(a + " " + b + " " + c);
		
		
		

	}

}
