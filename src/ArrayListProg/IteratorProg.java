package ArrayListProg;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorProg {

	public static void main(String[] args) {
		Vector v1=new Vector();
		for(int i=0;i<20;i++)
			v1.add(i);
			System.out.println(v1);
			System.out.println("---------------");
//			for(int i=0;i<20;i++)
//			System.out.println(v1.get(i));
			int i=0;
			System.out.println("Enumeration cursor output");
			Enumeration e=v1.elements();
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
//				i++;
//				if(i==10)
//					break;	
			}
			System.out.println("Iterator output");
			Iterator a=v1.iterator();
			while(a.hasNext())
			{
				int value=(int) a.next();
				if(value%2==0)
				System.out.println(value);
				else
					a.remove();
			}
			System.out.println("ListIterator output");
			ListIterator b=v1.listIterator();
			while(b.hasNext())
			{
				int value1=(int) b.next();
				if(value1==3)
					b.remove();
				else 
					if(value1==2)
						b.set(222);
					else
						if(value1==4)
							b.set(55);
				System.out.println(b.next());
				
			}
			System.out.println();
			
			
			
			
			
			
			
	}

}
