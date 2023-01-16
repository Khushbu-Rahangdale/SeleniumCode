package ArrayProg;

import java.util.Arrays;

public class Prog8_1 {

	public static void main(String[] args) {
		//String sentencs= "i@m@working@on@atomation@testing";
		String sentencs="01/08/1997";
//		Arrays.sort(array);
//		for(int v:array)
//			System.out.println(v);
		//System.out.println(array.s);
		String sentencsj[]=sentencs.split("/",2);
		for(String v:sentencsj)
		System.out.println(v);
			
		
		
	}

}
