package ArrayListProg;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorProg {

	public static void main(String[] args) {
		Vector a=new Vector();
		for(int i=0;i<10;i++)
			a.add(i);
		System.out.println(a);
		int i=0;
		Enumeration e=a.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
					
		}
		System.out.println("---------------------------------------");
		Iterator b=a.iterator();
		while(b.hasNext())
		{
			int value=(int) b.next();
			if(value%3==0)
				System.out.println(value);
			else
				b.remove();
		}
		System.out.println("-------------------------");
		ListIterator c=a.listIterator();
		while(c.hasNext())
		{
			int value1=(int) c.next();
			if(value1==1)
				c.set(33);
			System.out.println(c.next());
		}
			System.out.println();
			
	

		

	}

}
