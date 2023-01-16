package Seleniumprog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapProg {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "khushbu");
		hm.put(2 ,"pranali");
		hm.put(3, "vicky");
		hm.put(null, 1);
		hm.put(null, 2);
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.containsKey(null));
		System.out.println(hm.values());
		hm.put(8, null);
		hm.put(6, null);
		System.out.println(hm);
		Set a=hm.entrySet();
		Iterator itr=a.iterator();
		System.out.println("For utput -------------");
		for(;itr.hasNext();)
			
		{
			System.out.println(itr.next());


		}
		System.out.println("for While ----------------");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
