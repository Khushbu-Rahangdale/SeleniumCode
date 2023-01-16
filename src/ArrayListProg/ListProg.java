package ArrayListProg;

import java.util.LinkedList;

public class ListProg {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		LinkedList b=new LinkedList();
		a.add("khushbu");
		a.add("harry");
		a.add(2," sweety");
		System.out.println(a);
		a.remove();
		a.add('+');
		a.add(1);
		a.add(2);
		System.out.println(a);
		a.addFirst("khushbu");
		System.out.println(a);
		a.addFirst(4);
		System.out.println(a);
		a.poll();
		System.out.println(a);
		a.clone();
		System.out.println(a);

	}

}
