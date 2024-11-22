package assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Ass64_Iterator {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Object1");
		al.add("Object2");
		al.add("Object3");
		al.add("Object4");
		al.add("Object5");
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
