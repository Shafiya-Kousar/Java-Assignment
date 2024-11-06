package assignment;

import java.util.ArrayList;
import java.util.Collection;


public class Ass60_CollectionMethods {

	public static void main(String[] args) {
		
		Collection c=new ArrayList();
		c.add(10);
		c.add("Shafiya");
		c.add(100.99);
		c.add(false);
		c.add('r');
		System.out.println(c);
		
		Collection c1= new ArrayList();
		c1.addAll(c);
		c1.add(345);
	
		System.out.println(c1);
		
		boolean b=c.equals(c1);
		System.out.println(b);
		
		System.out.println(c.contains("Shafiya"));
		
		System.out.println(c1.containsAll(c));
		
		c.clear();
		System.out.println(c);
		System.out.println(c.isEmpty());
		
		System.out.println(c1.remove('r'));
		System.out.println(c1);
		
		c.addAll(c1);
		System.out.println(c);
		c1.add(123);
		System.out.println(c1.removeAll(c));
		System.out.println(c1);
		
	}

}
