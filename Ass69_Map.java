package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ass69_Map {

	public static void main(String[] args) {
		
	

		Map<String,Integer> m=new HashMap<String,Integer>();
	    m.put("Anu", 121);
	    m.put("Baala",212);
	    m.put("Deepak",312);
	    m.put("Rahul", 345);
	    m.put("Swapna", 434);
	    
	    System.out.println(m);
	    
	    Iterator<Entry <String,Integer>> ie=m.entrySet().iterator();
	    while(ie.hasNext())
	    {
	    	System.out.println(ie.next());
	    }
	}

}
