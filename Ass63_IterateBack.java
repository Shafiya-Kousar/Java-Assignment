package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ass63_IterateBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add("Object11");
		al.add("Object12");
		al.add("Object13");
		al.add("Object14");
		al.add("Object15");
		
		ListIterator li=al.listIterator();
		/*while(li.hasNext())
		{
			System.out.println(li.next());
		}
		*/while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		

	}

}
