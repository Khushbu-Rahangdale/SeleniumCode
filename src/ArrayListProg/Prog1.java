package ArrayListProg;

import java.util.ArrayList;

public class Prog1 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList(1000);
		ArrayList a3=new ArrayList(a2);
		System.out.println("Is a1 is empty ="+a1.isEmpty());
		System.out.println("size ="+a1.size());
		a1.add(11);
		a1.add("khushbu");
		a1.add("12.22222");
		a1.add('A');
		a1.add(null);
		 System.out.println("Is a1 is empty ="+a1.isEmpty());
		 System.out.println("size ="+a1.size());
		 for(int i=0;i<=10;i++)
		 {
			 a1.add(i);
		 }
		 System.out.println(a1);
		System.out.println(a1.indexOf(4));
		System.out.println(a1.get(7));
		System.out.println(a1.add(100));
		System.out.println(a1.lastIndexOf(10));
		System.out.println(a1.remove(1));
	}

}
