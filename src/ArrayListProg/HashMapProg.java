package ArrayListProg;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashMapProg {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		HashSet b=new HashSet(1000);
		
		HashSet c=new HashSet(12,20);
		HashSet d=new HashSet(a);
		a.add(10);
		a.add(1);
		a.add(20);
		a.add(12);
		System.out.println(a);
		b.add("a");
		b.add("khushbu");
		b.add("sweety");
		b.add(13);
		b.add(null);
		System.out.println(b);
		LinkedHashSet h=new LinkedHashSet();
		h.add(2);
		h.add(3);
		h.add(32);
		h.add(89);
		h.add(13);
	//	h.clear();
		//h.getClass();
		//h.contains(2);
		System.out.println(h);
		System.out.println(h.contains(2));
		System.out.println(h.isEmpty());
		

	}

}
