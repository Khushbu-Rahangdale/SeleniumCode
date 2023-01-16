package ArrayProg;

public class Prog2 {

	public static void main(String[] args) {
		int num[]= {12,13,14,15,13,10,16,17};
		System.out.println("length of num array = "+num.length);
		System.out.println(num[0]);
		System.out.println(num[3]);
		System.out.println("All element of array");
		for(int i=0;i<8;i++)
		System.out.println(num[i]+" ");
		
		
		//for each loop
		System.out.println("--------------------------");
		for(int result:num)
			System.out.print(result+" ");

	}

}
